package be.tomcools.gettersetterverifier.checks;

import be.tomcools.gettersetterverifier.GetSetVerificationContext;
import be.tomcools.gettersetterverifier.wrappers.Methods;

public class GetterShouldNotHaveParameter extends PropertyMethodParameterCount {
    private static final String ERROR_FORMAT = "Getters were found that have a parameter: %s";

    @Override
    protected String errorFormat() {
        return ERROR_FORMAT;
    }

    @Override
    protected Methods methodsToTest(GetSetVerificationContext context) {
        return context.getMethods().getterMethods();
    }

    @Override
    protected int parameterCount() {
        return 0;
    }
}
