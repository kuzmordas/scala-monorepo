package my.company.zio_http

import my.company.domain_shared.Domain
import zio.ZIO

object Server {
  def start(domain: Domain) =
    ZIO.log(s"server started: $domain")
}
