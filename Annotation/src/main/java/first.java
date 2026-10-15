import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Gav")
public class first {
	@Value("Gaurav")
	private String name;
	@Value("Singh")
	private String title;
	public first() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	
	public String getTitle() {
		return title;
	}
	
}
