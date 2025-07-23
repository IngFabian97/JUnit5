package listeners;

import java.util.Optional;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import utilities.Logs;

public class ResultListeners implements TestWatcher{

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
        Logs.info("Test Aborted: " + context.getDisplayName());
    }

    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        Logs.info("Test Disabled: " + context.getDisplayName() + " Reason: " + reason.orElse("No reason provided"));
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        Logs.error("Test Failed: " + context.getDisplayName() + " Cause: " + (cause != null ? cause.getMessage() : "No cause provided"));
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        Logs.info("Test Successful: " + context.getDisplayName());
    }


}
