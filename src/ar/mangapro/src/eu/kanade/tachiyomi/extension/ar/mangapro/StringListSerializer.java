package eu.kanade.tachiyomi.extension.ar.mangapro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.JsonTransformingSerializer;

/* JADX INFO: compiled from: Dto.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0014¨\u0006\t"}, d2 = {"Leu/kanade/tachiyomi/extension/ar/mangapro/StringListSerializer;", "Lkotlinx/serialization/json/JsonTransformingSerializer;", "", "", "<init>", "()V", "transformDeserialize", "Lkotlinx/serialization/json/JsonElement;", "element", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StringListSerializer extends JsonTransformingSerializer<List<? extends String>> {
    public static final StringListSerializer INSTANCE = new StringListSerializer();

    private StringListSerializer() {
        super(BuiltinSerializersKt.ListSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE)));
    }

    protected JsonElement transformDeserialize(JsonElement element) {
        ArrayList arrayListEmptyList;
        List listSplit$default;
        Intrinsics.checkNotNullParameter(element, "element");
        if (!(element instanceof JsonPrimitive)) {
            return element;
        }
        String contentOrNull = JsonElementKt.getContentOrNull((JsonPrimitive) element);
        if (contentOrNull == null || (listSplit$default = StringsKt.split$default(contentOrNull, new String[]{"\n"}, false, 0, 6, (Object) null)) == null) {
            arrayListEmptyList = null;
        } else {
            List list = listSplit$default;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(JsonElementKt.JsonPrimitive(StringsKt.trim((String) it.next()).toString()));
            }
            arrayListEmptyList = arrayList;
        }
        if (arrayListEmptyList == null) {
            arrayListEmptyList = CollectionsKt.emptyList();
        }
        return new JsonArray(arrayListEmptyList);
    }
}
