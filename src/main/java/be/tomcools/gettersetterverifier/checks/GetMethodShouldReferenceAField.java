package be.tomcools.gettersetterverifier.checks;

import be.tomcools.gettersetterverifier.GetSetVerificationContext;
import be.tomcools.gettersetterverifier.wrappers.Methods;

public class GetMethodShouldReferenceAField extends PropertyMethodShouldReferenceAField {
    private static final String ERROR_FORMAT = "Getters were found that do not reference a field: %s";

    @Override
    protected Methods getMethodsToTest(GetSetVerificationContext context) {
        return context.getMethods().getterMethods();
    }

    @Override
    protected String errorFormat() {
        return ERROR_FORMAT;
    }

}
