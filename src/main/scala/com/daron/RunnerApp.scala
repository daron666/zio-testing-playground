package com.daron

import zio.console._
import zio.{ExitCode, URIO}

object RunnerApp extends zio.App {
  override def run(args: List[String]): URIO[zio.ZEnv, ExitCode] = myAppLogic.exitCode

  val myAppLogic =
    for {
      _ <- putStrLn("Hello world!")
    } yield ()
}
