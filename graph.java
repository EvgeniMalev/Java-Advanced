import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;

public class SimpleGraph extends JFrame {

    public SimpleGraph() {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10, "Value", "Jan");
        dataset.addValue(15, "Value", "Feb");
        dataset.addValue(20, "Value", "Mar");
        dataset.addValue(25, "Value", "Apr");
        dataset.addValue(30, "Value", "May");

  
        JFreeChart lineChart = ChartFactory.createLineChart(
                "Monthly Data",      
                "Month",             
                "Value",             
                dataset,               
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(lineChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(600, 400));
        setContentPane(chartPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleGraph chart = new SimpleGraph();
            chart.setSize(700, 500);
            chart.setLocationRelativeTo(null);
            chart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            chart.setVisible(true);
        });
    }
}
