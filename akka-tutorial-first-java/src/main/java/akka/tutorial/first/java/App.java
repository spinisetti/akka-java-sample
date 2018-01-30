package akka.tutorial.first.java;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        ActorSystem actorSystem = ActorSystem.create("math");

        final ActorRef mathActor = actorSystem.actorOf(MathAddActor.props("hello"),"MatchActor");

        mathActor.tell("Hi Vasu", ActorRef.noSender());



        System.out.println( "Hello World!" );
    }
}
