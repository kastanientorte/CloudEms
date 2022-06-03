@Component
@EnableScheduling
public class MyTimer {
	@Scheduled(cron = "0/2 * * * * ?")
	public void addTimes(){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String format1 = format.format(new Date());
		System.out.println(format1);
	}
}