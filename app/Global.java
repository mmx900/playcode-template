import play.Application;
import play.GlobalSettings;
import play.db.jpa.JPA;

public class Global extends GlobalSettings {
	@Override
	public void onStart(Application app) {
		JPA.withTransaction(new play.libs.F.Callback0() {
			@Override
			public void invoke() throws Throwable {
				InitialData.insert();
			}
		});
	}
}
