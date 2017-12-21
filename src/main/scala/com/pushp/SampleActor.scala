package com.pushp

import akka.actor.{Actor, ActorLogging, Props}

object SampleActor{
  def props(): Props = Props(new SampleActor)
}

class SampleActor extends Actor with ActorLogging{

  override def receive = Actor.emptyBehavior
  override def preStart():Unit = log.info("Actor Starting")
  override def postStop():Unit = log.info("Actor Stopping")
}
