package org.openjdk.tools.objectlayout;

import java.lang.instrument.Instrumentation;

public class MainObjectGraph {

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.err.println("Usage: java-object-graph.jar [class-name]");
            System.exit(1);
        }
        ObjectGraph.analyze(System.out, Class.forName(args[0]));
    }

    public static void premain(String agentArgs, Instrumentation inst) {
        VMSupport.storeInstrumentation(inst);
    }

}