package com.krish.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class ServerAllocation {
    public static void main(String[] args) {
        Allocation serverAllocation = new Allocation();
        serverAllocation.allocate("api");
        serverAllocation.allocate("api");
        serverAllocation.allocate("api");
        serverAllocation.allocate("api");
        serverAllocation.allocate("api");
//        System.out.println(serverAllocation.getServer());
        serverAllocation.deallocate("api1");
        serverAllocation.deallocate("api2");
        serverAllocation.deallocate("api6");
//        System.out.println(serverAllocation.getServer());
        serverAllocation.allocate("api");
        serverAllocation.allocate("api");
        serverAllocation.allocate("api");
//        System.out.println(serverAllocation.getServer());
    }
}

class Allocation {

    private HashMap<String, TreeSet<Integer>> serverMap;

    public Allocation() {
        serverMap = new HashMap<>();
    }

    public HashMap<String, TreeSet<Integer>> getServer() {
        return serverMap;
    }

    public void allocate(String serverType) {
        if (serverMap.isEmpty() || !serverMap.containsKey(serverType)) {
            TreeSet<Integer> serverSet = new TreeSet<>();
            serverSet.add(1);
            serverMap.put(serverType, serverSet);
            System.out.printf("\nServer %s added", serverType + 1);
        } else {
            TreeSet<Integer> serverSet = serverMap.get(serverType);

            int tempServerId = 1;
            Iterator<Integer> it = serverSet.iterator();

            while (it.hasNext()) {
                if (tempServerId != it.next()) {
                    break;
                } else {
                    tempServerId++;
                }
            }
            serverSet.add(tempServerId);
            serverMap.put(serverType, serverSet);
            System.out.printf("\nServer %s added", serverType + tempServerId);
        }
    }

    public void deallocate(String serverName) {
        String[] part = serverName.split("(?<=\\D)(?=\\d)");
        String serverType = part[0];
        String serverId = part[1];

        if (serverType.isEmpty() || serverType == null
                || serverId.isEmpty() || serverId == null) {
            System.out.printf("\nServer %s not found", serverName);
        } else {
            if (serverMap.containsKey(serverType)) {
                TreeSet<Integer> serverSet = serverMap.get(serverType);

                try {
                    int serverIdNumber = Integer.parseInt(serverId);
                    if (serverSet.contains(serverIdNumber)) {
                        serverSet.remove(serverIdNumber);
                        System.out.printf("\nServer %s removed", serverName);
                    } else {
                        System.out.printf("\nServer %s not found", serverName);
                    }
                } catch (NumberFormatException e) {
                    System.out.printf("\nServer %s not found", serverName);
                }
            } else {
                System.out.printf("\nServer %s not found", serverName);
            }
        }
    }

}


//if (part[0] != null && part[1] != null
//        && serverMap.containsKey(part[0])
//        && serverMap.get(part[0]).contains(Integer.parseInt(part[1]))) {
//        serverMap.get(part[0]).remove(Integer.parseInt(part[1]));
//        System.out.printf("\nServer %s removed", serverId);
//        }
//        if(serverSet.isEmpty()) {
//            serverSet.add(1);
//        } else {
//            int nextServerId = serverSet.first();
//            Iterator<Integer> it = serverSet.iterator();
//
//            while (it.hasNext()) {
//                if(it.next() != nextServerId) {
//                    break;
//                } else {
//                    nextServerId++;
//                }
//            }
//
//            serverSet.add(nextServerId);
//        }