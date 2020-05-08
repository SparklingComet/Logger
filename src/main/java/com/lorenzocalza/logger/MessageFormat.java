package com.lorenzocalza.logger;

import java.util.List;

public interface MessageFormat {

    String message(String name, String datestr, String timestr, String message, List<String> custom);
}
