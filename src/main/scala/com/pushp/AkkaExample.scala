package com.pushp

import akka.actor.{ActorSystem, Props}
import com.pushp.models.Message

import scala.io.StdIn

object AkkaExample extends App{

  val actorSystem = ActorSystem("akka-system")

  val sampleActor = actorSystem.actorOf(SampleActor.props(),"sample-actors")
  val msgActor = actorSystem.actorOf(Props(new ActorMessaging(102,sampleActor)),"actor-messaging")

  msgActor ! "Hello"
  
  StdIn.readLine()
  actorSystem.terminate()
}
