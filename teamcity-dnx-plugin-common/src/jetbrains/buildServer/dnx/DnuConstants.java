/*
 * Copyright 2000-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * See LICENSE in the project root for license information.
 */

package jetbrains.buildServer.dnx;

/**
 * DNX utility runner constants.
 */
public interface DnuConstants {
    String DNU_RUNNER_TYPE = "dnu";
    String DNU_RUNNER_DISPLAY_NAME = "DNX Utility (dnu)";
    String DNU_RUNNER_DESCRIPTION = "Provides DNX package management";

    String DNU_COMMAND_BUILD = "build";
    String DNU_COMMAND_RESTORE = "restore";

    String DNU_PARAM_COMMAND = "dnu-command";
    String DNU_PARAM_ARGUMENTS = "dnu-args";
    String DNU_PARAM_RESTORE_PATHS = "dnu-restore-paths";
    String DNU_PARAM_PARALLEL = "dnu-parallel";
    String DNU_PARAM_PACKAGES_PATH = "dnu-packages-path";
    String DNU_PARAM_BUILD_PATHS = "dnu-restore-paths";
    String DNU_PARAM_BUILD_FRAMEWORK = "dnu-build-framework";
    String DNU_PARAM_BUILD_CONFIG = "dnu-build-config";
    String DNU_PARAM_BUILD_OUTPUT = "dnu-build-output";
}