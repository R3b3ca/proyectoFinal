import com.Rebeca.ds.ChicagoAnalysis.worker;

public class ElasticWorkerArray {

    private worker[] workerArray;
    private worker[] auxiliaryWorkerArray;

    public ElasticWorkerArray() {

    }

    public void addWorker(worker newWorker){
        if(this.workerArray == null){
            this.workerArray = new worker[1];
            this.workerArray[0] = newWorker;
        }
        else{
            this.auxiliaryWorkerArray = new worker[this.workerArray.length + 1];
            for(int index = 0; index < this.workerArray.length; ++index){
                this.auxiliaryWorkerArray[index] = this.workerArray[index];
            }
            this.auxiliaryWorkerArray[this.auxiliaryWorkerArray.length - 1] = newWorker;
            this.workerArray = this.auxiliaryWorkerArray;
        }
    }


    public worker[] getWorkerArray() {
        return workerArray;
    }
}
