package com.pushp

import akka.actor.{Actor, ActorLogging, ActorRef, Props}
import com.pushp.models.Message

/*object ActorMessaging{
  def props(actorId:Int):Props=Props(new ActorMessaging(actorId))


}*/
class ActorMessaging(actorId:Int, actorRef:ActorRef) extends Actor with ActorLogging{

  override def receive :Receive = {
    case msg => {
      log.info(s"\nPong $msg")
      actorRef ! msg
    }
  }
  override def preStart():Unit = log.info(s"Actor ActorMessaging $actorId Starting")
  override def postStop():Unit = log.info(s"Actor ActorMessaging $actorId Stopping")

}
