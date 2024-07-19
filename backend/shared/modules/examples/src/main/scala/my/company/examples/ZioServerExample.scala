package my.company.examples

import my.company.domain_shared.Domain
import my.company.zio_http.Server
import zio.{Scope, ZIO, ZIOAppArgs, ZIOAppDefault}

object ZioServerExample extends ZIOAppDefault {
  override def run: ZIO[Any with ZIOAppArgs with Scope, Any, Any] = {
    Server.start(Domain("value1", 123))
  }
}
