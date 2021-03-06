package iteration2.sort_order

sealed trait SortOrder

object SortOrder {

  case class Asc(emptyFirst: Boolean) extends SortOrder

  case class Desc(emptyFirst: Boolean) extends SortOrder

  case object Keep extends SortOrder

  object Asc {
    def emptyFirst: Asc = Asc(emptyFirst = true)

    def emptyLast: Asc = Asc(emptyFirst = false)
  }

  object Desc {
    def emptyFirst: Desc = Desc(emptyFirst = true)

    def emptyLast: Desc = Desc(emptyFirst = false)
  }
}
