import org.junit.jupiter.api.Test;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherConfig;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;


import static java.lang.String.format;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.platform.engine.discovery.DiscoverySelectors.selectPackage;

/**
 * @author Fil Lost
 * @since 17.09.2021
 */
public class TestLauncher {

	public final static String PACKAGE = "ru.mail.test";


	@Test
	public void launchTest() {

		LauncherDiscoveryRequest launcherDiscoveryRequest = LauncherDiscoveryRequestBuilder.request()
				.selectors(
						selectPackage(PACKAGE)
				)
				.build();

		executeLauncherRequest(launcherDiscoveryRequest);
	}


	private static void executeLauncherRequest(LauncherDiscoveryRequest launcherDiscoveryRequest) {
		LauncherConfig launcherConfig = LauncherConfig.builder()
				.enableTestEngineAutoRegistration(true)
				.enableTestExecutionListenerAutoRegistration(true)
				.build();
		try {
			LauncherFactory.create(launcherConfig)
					.execute(launcherDiscoveryRequest);
		} catch (Exception e) {
			fail(format("ERROR execute LauncherDiscoveryRequest:\n{}", e.getMessage()));
		}
	}


}
