package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object Katalon_URL
     
    /**
     * <p></p>
     */
    public static Object Katalon_USER
     
    /**
     * <p></p>
     */
    public static Object Katalon_PWD
     
    /**
     * <p></p>
     */
    public static Object Theinternet_URL
     
    /**
     * <p></p>
     */
    public static Object Theinternet_USER
     
    /**
     * <p></p>
     */
    public static Object Theinternet_PWD
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            Katalon_URL = selectedVariables['Katalon_URL']
            Katalon_USER = selectedVariables['Katalon_USER']
            Katalon_PWD = selectedVariables['Katalon_PWD']
            Theinternet_URL = selectedVariables['Theinternet_URL']
            Theinternet_USER = selectedVariables['Theinternet_USER']
            Theinternet_PWD = selectedVariables['Theinternet_PWD']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
