def toInt(value, min, max) {
    try {
        def intVal = value.toInteger()
        return Math.max(min, Math.min(max, intVal))
    } catch(e) {
        // fallback لو المستخدم كتب قيمة مش رقم
        return min
    }
}
