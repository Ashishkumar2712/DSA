class RideSharingSystem {
    ArrayDeque<Integer> drivers = new ArrayDeque<>();
    ArrayDeque<Integer> riders = new ArrayDeque<>();
    HashSet<Integer> waiting = new HashSet<>();
    HashSet<Integer> cancelled = new HashSet<>();

    public RideSharingSystem() {}

    public void addRider(int riderId) {
        riders.addLast(riderId);
        waiting.add(riderId);
    }

    public void addDriver(int driverId) {
        drivers.addLast(driverId);
    }

    public int[] matchDriverWithRider() {
        while (!riders.isEmpty() && cancelled.contains(riders.peekFirst())) {
            int rid = riders.removeFirst();
            cancelled.remove(rid);
            waiting.remove(rid);
        }

        if (!riders.isEmpty() && !drivers.isEmpty()) {
            int did = drivers.removeFirst();
            int rid = riders.removeFirst();
            waiting.remove(rid);
            return new int[]{did, rid};
        }

        return new int[]{-1, -1};
    }

    public void cancelRider(int riderId) {
        if (waiting.contains(riderId)) {
            cancelled.add(riderId);
        }
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */