import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

public class ProcessorName {
    public static void main(String[] args) {
        OperatingSystemMXBean osBean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        String processorName =  osBean.get
        System.out.println("Processor Name: " + processorName);
    }
}
