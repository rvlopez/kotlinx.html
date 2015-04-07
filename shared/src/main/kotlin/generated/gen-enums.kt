package html4k

import html4k.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

enum public class ColS(override val realValue : String) : AttributeEnum {
}

val colSValues : Map<String, ColS> = ColS.values().toMap { it.realValue }

enum public class ColSpan(override val realValue : String) : AttributeEnum {
}

val colSpanValues : Map<String, ColSpan> = ColSpan.values().toMap { it.realValue }

enum public class Dir(override val realValue : String) : AttributeEnum {
    ltr : Dir("ltr")
    rtl : Dir("rtl")
}

val dirValues : Map<String, Dir> = Dir.values().toMap { it.realValue }

enum public class Draggable(override val realValue : String) : AttributeEnum {
    true_ : Draggable("true")
    false_ : Draggable("false")
    auto : Draggable("auto")
}

val draggableValues : Map<String, Draggable> = Draggable.values().toMap { it.realValue }

enum public class EncType(override val realValue : String) : AttributeEnum {
    multipartFormData : EncType("multipart/form-data")
    applicationXWwwFormUrlEncoded : EncType("application/x-www-form-urlencoded")
    textPlain : EncType("text/plain")
}

val encTypeValues : Map<String, EncType> = EncType.values().toMap { it.realValue }

enum public class FormEncType(override val realValue : String) : AttributeEnum {
    multipartFormData : FormEncType("multipart/form-data")
    applicationXWwwFormUrlEncoded : FormEncType("application/x-www-form-urlencoded")
    textPlain : FormEncType("text/plain")
}

val formEncTypeValues : Map<String, FormEncType> = FormEncType.values().toMap { it.realValue }

enum public class FormMethod(override val realValue : String) : AttributeEnum {
    get : FormMethod("get")
    post : FormMethod("post")
    put : FormMethod("put")
    delete : FormMethod("delete")
}

val formMethodValues : Map<String, FormMethod> = FormMethod.values().toMap { it.realValue }

public object FormTarget {
    val blank : String = "_blank"
    val parent : String = "_parent"
    val self : String = "_self"
    val top : String = "_top"
    val values : List<String> = listOf("blank","parent","self","top")
}



public object HttpEquiv {
    val contentLanguage : String = "content-language"
    val contentType : String = "content-type"
    val defaultStyle : String = "default-style"
    val refresh : String = "refresh"
    val values : List<String> = listOf("contentLanguage","contentType","defaultStyle","refresh")
}


enum public class KeyType(override val realValue : String) : AttributeEnum {
    rsa : KeyType("rsa")
}

val keyTypeValues : Map<String, KeyType> = KeyType.values().toMap { it.realValue }


public object Media {
    val screen : String = "screen"
    val print : String = "print"
    val tty : String = "tty"
    val tv : String = "tv"
    val projection : String = "projection"
    val handheld : String = "handheld"
    val braille : String = "braille"
    val aural : String = "aural"
    val all : String = "all"
    val values : List<String> = listOf("screen","print","tty","tv","projection","handheld","braille","aural","all")
}


enum public class Method(override val realValue : String) : AttributeEnum {
    get : Method("get")
    post : Method("post")
    put : Method("put")
    delete : Method("delete")
}

val methodValues : Map<String, Method> = Method.values().toMap { it.realValue }

public object Rel {
    val alternate : String = "Alternate"
    val appEndIx : String = "Appendix"
    val bookmark : String = "Bookmark"
    val chapter : String = "Chapter"
    val contentS : String = "Contents"
    val copyright : String = "Copyright"
    val glossary : String = "Glossary"
    val help : String = "Help"
    val index : String = "Index"
    val next : String = "Next"
    val prev : String = "Prev"
    val section : String = "Section"
    val start : String = "Start"
    val stylesheet : String = "Stylesheet"
    val subsection : String = "Subsection"
    val values : List<String> = listOf("alternate","appEndIx","bookmark","chapter","contentS","copyright","glossary","help","index","next","prev","section","start","stylesheet","subsection")
}


enum public class RowS(override val realValue : String) : AttributeEnum {
}

val rowSValues : Map<String, RowS> = RowS.values().toMap { it.realValue }

enum public class RowSpan(override val realValue : String) : AttributeEnum {
}

val rowSpanValues : Map<String, RowSpan> = RowSpan.values().toMap { it.realValue }

enum public class RunAt(override val realValue : String) : AttributeEnum {
    server : RunAt("server")
}

val runAtValues : Map<String, RunAt> = RunAt.values().toMap { it.realValue }

enum public class Sandbox(override val realValue : String) : AttributeEnum {
    allowSameOrigin : Sandbox("allow-same-origin")
    allowFormS : Sandbox("allow-forms")
    allowScriptS : Sandbox("allow-scripts")
}

val sandboxValues : Map<String, Sandbox> = Sandbox.values().toMap { it.realValue }

enum public class Scope(override val realValue : String) : AttributeEnum {
    col : Scope("col")
    colGroup : Scope("colgroup")
    row : Scope("row")
    rowGroup : Scope("rowgroup")
}

val scopeValues : Map<String, Scope> = Scope.values().toMap { it.realValue }

enum public class Shape(override val realValue : String) : AttributeEnum {
    rect : Shape("rect")
    circle : Shape("circle")
    poly : Shape("poly")
    default : Shape("default")
}

val shapeValues : Map<String, Shape> = Shape.values().toMap { it.realValue }

enum public class Span(override val realValue : String) : AttributeEnum {
}

val spanValues : Map<String, Span> = Span.values().toMap { it.realValue }

public object Target {
    val blank : String = "_blank"
    val parent : String = "_parent"
    val self : String = "_self"
    val top : String = "_top"
    val values : List<String> = listOf("blank","parent","self","top")
}


public object Type {
    val textAsp : String = "text/asp"
    val textAsa : String = "text/asa"
    val textCss : String = "text/css"
    val textHtml : String = "text/html"
    val textJavaScript : String = "text/javascript"
    val textPlain : String = "text/plain"
    val textScriptLet : String = "text/scriptlet"
    val textXComponent : String = "text/x-component"
    val textXHtmlInsertion : String = "text/x-html-insertion"
    val textXml : String = "text/xml"
    val values : List<String> = listOf("textAsp","textAsa","textCss","textHtml","textJavaScript","textPlain","textScriptLet","textXComponent","textXHtmlInsertion","textXml")
}


enum public class Wrap(override val realValue : String) : AttributeEnum {
    hard : Wrap("hard")
    soft : Wrap("soft")
}

val wrapValues : Map<String, Wrap> = Wrap.values().toMap { it.realValue }
