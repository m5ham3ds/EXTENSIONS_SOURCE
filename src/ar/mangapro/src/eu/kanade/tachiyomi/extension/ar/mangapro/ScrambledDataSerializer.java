package eu.kanade.tachiyomi.extension.ar.mangapro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonTransformingSerializer;

/* JADX INFO: compiled from: Dto.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0014¨\u0006\t"}, d2 = {"Leu/kanade/tachiyomi/extension/ar/mangapro/ScrambledDataSerializer;", "Lkotlinx/serialization/json/JsonTransformingSerializer;", "", "Leu/kanade/tachiyomi/extension/ar/mangapro/ScrambledData;", "<init>", "()V", "transformDeserialize", "Lkotlinx/serialization/json/JsonElement;", "element", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ScrambledDataSerializer extends JsonTransformingSerializer<List<? extends ScrambledData>> {
    public static final ScrambledDataSerializer INSTANCE = new ScrambledDataSerializer();

    private ScrambledDataSerializer() {
        super(BuiltinSerializersKt.ListSerializer(ScrambledData.INSTANCE.serializer()));
    }

    protected JsonElement transformDeserialize(JsonElement element) {
        JsonObject jsonObject;
        Intrinsics.checkNotNullParameter(element, "element");
        Iterable jsonArray = JsonElementKt.getJsonArray(element);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(jsonArray, 10));
        Iterator it = jsonArray.iterator();
        while (it.hasNext()) {
            Map jsonObject2 = JsonElementKt.getJsonObject((JsonElement) it.next());
            if (jsonObject2.containsKey("method")) {
                jsonObject = new JsonObject(MapsKt.plus(jsonObject2, TuplesKt.to("type", JsonElementKt.JsonPrimitive("indirect"))));
            } else {
                jsonObject = new JsonObject(MapsKt.plus(jsonObject2, TuplesKt.to("type", JsonElementKt.JsonPrimitive("direct"))));
            }
            arrayList.add(jsonObject);
        }
        return new JsonArray(arrayList);
    }
}
