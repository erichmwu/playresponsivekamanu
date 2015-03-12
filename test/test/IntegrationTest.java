package test;

import org.junit.Test;
import play.libs.F.Callback;
import play.test.TestBrowser;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.HTMLUNIT;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.inMemoryDatabase;
import static play.test.Helpers.running;
import static play.test.Helpers.testServer;

/**
 * Runs a server with a fake in-memory database to test the system.
 */
public class IntegrationTest {

  /**
   * Check to see that both the index and page1 pages can be retrieved.
   */
  @Test
  public void test() {
    running(testServer(3333, fakeApplication(inMemoryDatabase())), HTMLUNIT, new Callback<TestBrowser>() {
      public void invoke(TestBrowser browser) {
        browser.goTo("http://localhost:3333");
        assertThat(browser.pageSource()).contains("We build canoes.");

        browser.goTo("http://localhost:3333/pueo");
        assertThat(browser.pageSource()).contains("The Pueo is the most versatile "
            + "all-around canoe that we know how to make.");

        browser.goTo("http://localhost:3333/aukahi");
        assertThat(browser.pageSource()).contains("The Aukahi: Tahitian V1 design with Hawaiian attitude.");

        browser.goTo("http://localhost:3333/kamanu");
        assertThat(browser.pageSource()).contains("The most exciting thing in paddling since the T-Top.");

        browser.goTo("http://localhost:3333/about");
        assertThat(browser.pageSource()).contains("Become the most amazing company "
            + "in the entire world… and build good canoes while we’re at it.");
      }
    });
  }

}
