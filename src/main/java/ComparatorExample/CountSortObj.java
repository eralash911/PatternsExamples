package ComparatorExample;

import java.util.ArrayList;
import java.util.List;

public class CountSortObj {
    public static void main(String[] args) {
        ArrayList<Worker> workerList = new ArrayList<>();

        workerList.add( new Worker(1,"Dave", "4324", 1));
        workerList.add( new Worker(3,"Bob", "4333224", 4));
        workerList.add( new Worker(2,"Dave", "4324", 6));
        workerList.add( new Worker(4,"Dave", "4324", 9));

        for (Worker w: countSortObject(workerList)) {
            System.out.println(w);
            
        }

    }


    public static Worker[] countSortObject(List<Worker> workers){
        final  int MAX_VALUE = 10;
        int[] counter = new int[MAX_VALUE];
        for (int i = 0; i < workers.size(); i++) {
            counter[workers.get(i).qualc] = counter[workers.get(i).qualc] + 1;
            
        }
        Worker[] out = new Worker[workers.size()];

        for (int i = 1; i < counter.length; i++) {
            counter[i] = counter[i]+ counter[i - 1];
        }

        for (int i = workers.size() - 1; i >= 0 ; i--) {
            Worker worker = workers.get(i);
            out[counter[worker.qualc] -1]= worker;
            counter[worker.qualc]--;
        }
        return out;
    }
    static class Worker{
        int id;
        String name;
        String phone;
        int qualc;

        public Worker(int id, String name, String phone, int qualc) {
            this.id = id;
            this.name = name;
            this.phone = phone;
            this.qualc = qualc;
        }

        @Override
        public String toString() {
            return "Worker{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", phone='" + phone + '\'' +
                    ", qualc=" + qualc +
                    '}';
        }
    }
}
