package org.teneted.papermodloader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PaperModLoader {

    public static final Logger LOGGER =
        LoggerFactory.getLogger("PaperModLoader");

    public static void init() {
        LOGGER.info("PaperModLoader is loading...");
    }
}
