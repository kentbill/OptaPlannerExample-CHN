/*
 * Copyright 2014 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaplanner.examples.cheaptime.app;

import org.optaplanner.examples.cheaptime.domain.CheapTimeSolution;
import org.optaplanner.examples.cheaptime.persistence.CheapTimeExporter;
import org.optaplanner.examples.cheaptime.persistence.CheapTimeImporter;
import org.optaplanner.examples.cheaptime.swingui.CheapTimePanel;
import org.optaplanner.examples.common.app.CommonApp;
import org.optaplanner.examples.common.persistence.AbstractSolutionExporter;
import org.optaplanner.examples.common.persistence.AbstractSolutionImporter;
import org.optaplanner.persistence.common.api.domain.solution.SolutionFileIO;
import org.optaplanner.persistence.xstream.impl.domain.solution.XStreamSolutionFileIO;

public class CheapTimeApp extends CommonApp<CheapTimeSolution> {

    public static final String SOLVER_CONFIG
            = "org/optaplanner/examples/cheaptime/solver/cheapTimeSolverConfig.xml";

    public static final String DATA_DIR_NAME = "cheaptime";

    public static void main(String[] args) {
        prepareSwingEnvironment();
        new CheapTimeApp().init();
    }

    public CheapTimeApp() {
        super("按时间降低成本规划",
                "官方比赛名称: ICON Challenge on Forecasting and Scheduling\n\n" +
                "将任务分配到机台（空间）和时间上.\n\n" +
                "每个机台必然有足够的硬件资源来运行分配到它的任务.\n" +
                "每个任务和机台都会消耗电能，电费在不同的时段价格不同.\n" +
                "优化目标：最小化电费.",
                SOLVER_CONFIG, DATA_DIR_NAME,
                CheapTimePanel.LOGO_PATH);
    }

    @Override
    protected CheapTimePanel createSolutionPanel() {
        return new CheapTimePanel();
    }

    @Override
    public SolutionFileIO<CheapTimeSolution> createSolutionFileIO() {
        return new XStreamSolutionFileIO<>(CheapTimeSolution.class);
    }

    @Override
    protected AbstractSolutionImporter[] createSolutionImporters() {
        return new AbstractSolutionImporter[]{
                new CheapTimeImporter()
        };
    }

    @Override
    protected AbstractSolutionExporter createSolutionExporter() {
        return new CheapTimeExporter();
    }

}
