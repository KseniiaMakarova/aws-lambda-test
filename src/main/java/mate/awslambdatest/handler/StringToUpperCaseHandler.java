package mate.awslambdatest.handler;

import com.amazonaws.services.lambda.runtime.Context;
import mate.awslambdatest.domain.StringToUpperCaseRequest;
import mate.awslambdatest.domain.StringToUpperCaseResponse;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class StringToUpperCaseHandler
        extends SpringBootRequestHandler<StringToUpperCaseRequest, StringToUpperCaseResponse> {

    public StringToUpperCaseResponse handleRequest(
            StringToUpperCaseRequest request, Context context) {
        String input = request.getInput();
        context.getLogger().log("Input: " + input);
        StringToUpperCaseResponse response = new StringToUpperCaseResponse();
        response.setResult(input.toUpperCase());
        return response;
    }
}
