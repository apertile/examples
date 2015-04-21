package net.codejava.springmvc;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import net.codejava.springmvc.controllers.HomeController;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
@WebAppConfiguration
public class HomeControllerTests {

	// @Mock
	// private Model model;
	
	@Configuration
    public static class TestConfiguration {
 
        @Bean 
        public HomeController homeController() {
            return new HomeController();
        }
 
    }

	private MockMvc mockMvc;
	
	@Autowired
    private WebApplicationContext webApplicationContext;

	@Before
	public void setup() {

		// Process mock annotations
//		MockitoAnnotations.initMocks(this);

		// Setup Spring test in standalone mode
//		this.mockMvc = MockMvcBuilders.standaloneSetup(new HomeController()).build();

		this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

//	@Test
//	public void testHomeControllerUglyWay() throws Exception {
//		HomeController controller = new HomeController();
//		Model model = new ExtendedModelMap();
//		String view = controller.home(new Locale("en_US"), model);
//		assertEquals("home", view);
//	}

	@Test
	public void testHomeControllerFancyWay() throws Exception {

		mockMvc.perform(get("/"))
				.andExpect(status().isOk())
				.andExpect(view().name("home"))
				.andExpect(forwardedUrl("/WEB-INF/views/home.jsp"))
				.andExpect(model().attribute("serverTime", DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, new Locale("en_US")).format(new Date())));
	}
	
	@Test
	public void testDummyControllerFancyWay() throws Exception {

		mockMvc.perform(get("/dummy"))
				.andExpect(status().isOk())
				.andExpect(view().name("dummy"))
				.andExpect(forwardedUrl("/WEB-INF/views/dummy.jsp"));
	}
}
