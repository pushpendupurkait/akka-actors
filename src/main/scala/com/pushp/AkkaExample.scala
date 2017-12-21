package com.pushp

import akka.actor.ActorSystem

import scala.io.StdIn

object AkkaExample extends App{

  val actorSystem = ActorSystem("akka-system")

  actorSystem.actorOf(SampleActor.props(),"sample-actors")
  StdIn.readLine()
  actorSystem.terminate()
}
