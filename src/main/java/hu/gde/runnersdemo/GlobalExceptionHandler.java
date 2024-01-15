package hu.gde.runnersdemo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e, Model model) {
        // Log the exception
        log.error("Internal Server Error", e);

        // You can add more details to the model if needed
        model.addAttribute("error", "An unexpected error occurred. Please try again.");

        // Return a custom error page or redirect to an error page
        return "error";
    }
}
