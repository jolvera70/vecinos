package com.jb.vecinos;

import com.jb.vecinos.controller.RootController;
import com.jb.vecinos.services.RootService;

import java.util.Collection;
import java.util.Map;

import com.jb.vecinos.services.RootServiceImpl;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.ui.Model;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:test-spring-servlet-context.xml"})
public class RootControllerTest {
    private RootService rootServiceMock;

    private RootController rootController;

    public RootControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        rootController = new RootController();

        rootServiceMock = new RootServiceImpl();
        ReflectionTestUtils.setField(rootController, "rootService", rootServiceMock);
    }

    @After
    public void tearDown() {

    }

    /**
     * Test of getUser method, of class UserController.
     */
    @Test
    public void testLogin() throws Exception {
        Model model = mock(Model.class);
        rootController.login(model);
    }

    @Test
    public void testHome() throws Exception {
        Model model = mock(Model.class);
        rootController.home(model);
    }

    @Test
    public void testAccessDenied() throws Exception {
        Model model = mock(Model.class);
        rootController.accessDenied(model);
    }

    @Test
    public void testLoginError() throws Exception {
        Model model = mock(Model.class);
        rootController.loginError(model);
    }

    @Test
    public void testAddAdminUser() throws Exception {
        Model model = mock(Model.class);
        rootController.addAdminUser(model);
    }

}