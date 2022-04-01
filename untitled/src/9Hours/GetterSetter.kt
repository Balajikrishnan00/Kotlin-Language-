package `9Hours`

class GetterSetter {

    var name:String?=null
        get() = "Hello  $field"
        set(value) {
            if (value!!.startsWith("bal")){
                field="Balaji Krishnan"
            }
        }

    var lastname:String?=null
        set(value) {
            field =value
        }
        get() {
            return field
        }

    var secondName:String?=null




}