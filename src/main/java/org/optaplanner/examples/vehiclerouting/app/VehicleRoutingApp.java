/*
 * Copyright 2012 Red Hat, Inc. and/or its affiliates.
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

package org.optaplanner.examples.vehiclerouting.app;

import org.optaplanner.examples.common.app.CommonApp;
import org.optaplanner.examples.common.persistence.AbstractSolutionImporter;
import org.optaplanner.examples.vehiclerouting.domain.VehicleRoutingSolution;
import org.optaplanner.examples.vehiclerouting.persistence.VehicleRoutingImporter;
import org.optaplanner.examples.vehiclerouting.swingui.VehicleRoutingPanel;
import org.optaplanner.persistence.common.api.domain.solution.SolutionFileIO;
import org.optaplanner.persistence.xstream.impl.domain.solution.XStreamSolutionFileIO;

public class VehicleRoutingApp extends CommonApp<VehicleRoutingSolution> {

    public static final String SOLVER_CONFIG
            = "org/optaplanner/examples/vehiclerouting/solver/vehicleRoutingSolverConfig.xml";

    public static final String DATA_DIR_NAME = "vehiclerouting";

    public static void main(String[] args) {
        prepareSwingEnvironment();
        new VehicleRoutingApp().init();
    }

    public VehicleRoutingApp() {
    	/*
        super("Vehicle routing",
                "Official competition name: Capacitated vehicle routing problem (CVRP), " +
                        "optionally with time windows (CVRPTW)\n\n" +
                        "Pick up all items of all customers with a few vehicles.\n\n" +
                        "Find the shortest route possible.\n" +
                        "Do not overload the capacity of the vehicles.\n" +
                        "Arrive within the time window of each customer.",
                SOLVER_CONFIG, DATA_DIR_NAME,
                VehicleRoutingPanel.LOGO_PATH);
        */
    	
    	super("车辆路径规划",
                "官方比赛名称: 有限载重下的车辆路径规划问题 - Capacitated vehicle routing problem (CVRP), " +
                        "添加可选条件 - 时间窗口下的车辆路线规划  (CVRPTW)\n\n" +
                        "用数台车辆将揽收所有客户的所有邮包.\n\n" +
                        "给辆车找出尽可能短的运行路径.\n" +
                        "每辆车收件总重不可超过其载重限制.\n" +
                        "在每个客户指定的时候窗口内到达收件处.",
                SOLVER_CONFIG, DATA_DIR_NAME,
                VehicleRoutingPanel.LOGO_PATH);
    }

    @Override
    protected VehicleRoutingPanel createSolutionPanel() {
        return new VehicleRoutingPanel();
    }

    @Override
    public SolutionFileIO<VehicleRoutingSolution> createSolutionFileIO() {
        return new XStreamSolutionFileIO<>(VehicleRoutingSolution.class);
    }

    @Override
    protected AbstractSolutionImporter[] createSolutionImporters() {
        return new AbstractSolutionImporter[]{
                new VehicleRoutingImporter()
        };
    }

}
