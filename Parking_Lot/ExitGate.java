public class ExitGate implements Gate {
    private String id;
  
    ExitGate(){
        this.id = String.valueOf(Math.random());

    }

    @Override
    public String getId(){
        return id;
    }

 

    public Ticket checkout(Ticket ticket){
        return null;
    }
}
