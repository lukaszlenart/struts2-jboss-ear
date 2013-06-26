package org.demo.actions;

import org.apache.struts2.StrutsJUnit4TestCase;
import org.apache.struts2.cdi.CdiObjectFactory;
import org.jboss.weld.environment.se.StartMain;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.Before;
import org.junit.Test;
import org.springframework.mock.jndi.SimpleNamingContextBuilder;

import static org.junit.Assert.assertEquals;

public class IndexTest extends StrutsJUnit4TestCase<Index> {

    @Before
    public void setUp() throws Exception {
        SimpleNamingContextBuilder builder = new SimpleNamingContextBuilder();
        builder.activate();

        StartMain sm = new StartMain(new String[0]);
        WeldContainer weldContainer = sm.go();
        builder.bind(CdiObjectFactory.CDI_JNDIKEY_BEANMANAGER_COMP, weldContainer.getBeanManager());
        super.setUp();
    }

    @Test
    public void testCdi() throws Exception {
        // given
        executeAction("/index");

        // when
        Index action = getAction();

        // then
        String redirect = action.getRedirectName();
        assertEquals("success", redirect);
    }

    @Override
    protected String getConfigPath() {
        return "struts-plugin.xml";
    }

}
