package com.pushp

import akka.actor.{Actor, ActorLogging, Props}
import com.pushp.models.Message

object SampleActor{
  def props(): Props = Props(new SampleActor)
}

class SampleActor extends Actor with ActorLogging{

  override def receive = {
    case msg => {
      log.info(s"\nPing $msg")
      Thread.sleep(1000)
      sender() ! msg
    }
  }
  override def preStart():Unit = log.info("Actor Starting")
  override def postStop():Unit = {
    log.info("Actor Stopping")
  }
}
