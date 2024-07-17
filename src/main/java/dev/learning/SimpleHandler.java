package dev.learning;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class SimpleHandler implements RequestHandler<String, String> {
    @Override
    public String handleRequest(String s, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("Function Name: " + context.getFunctionName());
        logger.log("String " + s + " will be converted to Upper Case...");
        return s.toUpperCase();


    }
}
