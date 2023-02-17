//Non guardare questa classe , ero convinto che fosse un int sulla tabella poi mi sono reso conto che non servisse quando hai mandato la soluzione su discord
public enum Session {
    CYCLING(1),
    RUNNING(2);

    public Integer id;

    Session(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Session selectEnumFromId(Integer Id){
        Session sessionSelected = null;
        for(Session session : Session.values()){
            if(session.getId().equals(id)){
                sessionSelected = session;
            }
        }
        return sessionSelected;
    }
}
