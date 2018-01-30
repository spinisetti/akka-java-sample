package akka.tutorial.first.java;


import akka.actor.AbstractActor;
import akka.actor.Props;
import akka.event.Logging;
import akka.event.LoggingAdapter;

public class MathAddActor extends AbstractActor {

    String message;
    public MathAddActor(String message) {
        this.message = message;
    }

    static public Props props(String message) {
        return Props.create(MathAddActor.class, () -> new MathAddActor(message));
    }


    private LoggingAdapter log = Logging.getLogger(getContext().getSystem(), this);

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(String.class, s -> {
                    log.info("Hello " + s);
                })
                .build();
    }
}
