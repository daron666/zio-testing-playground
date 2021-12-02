package com.daron

import zio.{ExitCode, URIO}
import zio.console._

object RunnerApp extends zio.App {
  override def run(args: List[String]): URIO[zio.ZEnv, ExitCode] = myAppLogic.exitCode

  val myAppLogic =
    for {
      _    <- putStrLn("Hello! What is your name?")
      name <- getStrLn
      _    <- putStrLn(s"Hello, ${name}, welcome to ZIO!")
    } yield ()
}
