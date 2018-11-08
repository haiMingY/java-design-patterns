import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

// 图表工厂类：工厂类  
// 普通 工厂
// class ChartFactory {
//     public static Chart getChart(String type) {
//         Chart chart = null;
//         if (type.equalsIgnoreCase("histogram")) {
//             chart = new HistogramChart();
//         } else if (type.equalsIgnoreCase("pie")) {
//             chart = new PieChart();
//         } else if (type.equalsIgnoreCase("line")) {
//             chart = new LineChart();
//         }
//         return chart;
//     }
// }

// 通过配置文件 利用反射来创建对象

class ChartFactory {
    public static Chart getChart() {
        Properties p = new Properties();

        InputStream in = null;
        //读取配置文件
        try {
            in = ChartFactory.class.getResourceAsStream("Factory.properties");
            p.load(in);
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("装在工厂配置文件出错：");
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }

        Chart chart = null;
        try {
            chart = (Chart)Class.forName(p.getProperty("ChartClass")).newInstance();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        return chart;
    }
}