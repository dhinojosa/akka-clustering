package com.xyzcorp.cluster.scala

import akka.actor.Actor
import akka.event.Logging

class SimpleActor extends Actor {
  val log = Logging(context.system, this)

  override def receive: PartialFunction[Any, Unit] = {
    case x: String => log.info("Received message: {}", x)
  }
}
