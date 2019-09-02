package goahead.supermm2.wiki

import goahead.supermm2._

final class WikiRoute(root: String, actors: Actors) extends Supermm2Route(actors) {
  override val Routes = Seq(routes.WikiUserRoute(actors))
}