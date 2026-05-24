package eu.kanade.tachiyomi.extension.ar.mangapro;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.util.Log;
import eu.kanade.tachiyomi.network.OkHttpExtensionsKt;
import eu.kanade.tachiyomi.network.RequestsKt;
import eu.kanade.tachiyomi.source.model.Filter;
import eu.kanade.tachiyomi.source.model.FilterList;
import eu.kanade.tachiyomi.source.model.MangasPage;
import eu.kanade.tachiyomi.source.model.Page;
import eu.kanade.tachiyomi.source.model.SChapter;
import eu.kanade.tachiyomi.source.model.SManga;
import eu.kanade.tachiyomi.source.online.HttpSource;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import keiyoushi.lib.cookieinterceptor.CookieInterceptor;
import keiyoushi.utils.JsonKt;
import keiyoushi.utils.NextJsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.io.CloseableKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.StringFormat;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JvmStreamsKt;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal._UtilCommonKt;
import okio.Buffer;
import okio.BufferedSource;
import rx.Observable;
import rx.functions.Func1;

/* JADX INFO: compiled from: ProChan.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010 \u001a\u00020\u0012H\u0016J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010 \u001a\u00020\u0012H\u0016J\u0018\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020'H\u0002J&\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020'H\u0016J \u0010)\u001a\u00020*2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020'H\u0014J\b\u0010+\u001a\u00020'H\u0016J\u0010\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020\u00052\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u00100\u001a\u00020.2\u0006\u00101\u001a\u000202H\u0014J\u0010\u00103\u001a\u00020*2\u0006\u0010-\u001a\u00020.H\u0014J\u0016\u00104\u001a\b\u0012\u0004\u0012\u000206052\u0006\u00101\u001a\u000202H\u0014J\u0010\u00109\u001a\u00020*2\u0006\u0010:\u001a\u000206H\u0014J\u0010\u0010;\u001a\u00020\u00052\u0006\u0010:\u001a\u000206H\u0016J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u00020=052\u0006\u00101\u001a\u000202H\u0014J\u0010\u0010>\u001a\u00020*2\u0006\u0010 \u001a\u00020=H\u0014J\u0010\u0010?\u001a\u0002022\u0006\u0010@\u001a\u00020AH\u0002J\u0010\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0002J\u0010\u0010K\u001a\u00020L2\u0006\u0010I\u001a\u00020\u0005H\u0002J\u001c\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\u00052\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010Q\u001a\u00020*2\u0006\u0010 \u001a\u00020\u0012H\u0014J\u0010\u0010R\u001a\u00020\u001f2\u0006\u00101\u001a\u000202H\u0014J\u0010\u0010S\u001a\u00020*2\u0006\u0010 \u001a\u00020\u0012H\u0014J\u0010\u0010T\u001a\u00020\u001f2\u0006\u00101\u001a\u000202H\u0014J\u0010\u0010U\u001a\u00020\u001f2\u0006\u00101\u001a\u000202H\u0014J\u0010\u0010V\u001a\u00020\u00052\u0006\u00101\u001a\u000202H\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u000e\u0010\n\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010B\u001a\u001a\u0012\u0004\u0012\u00020\u0012\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020D0C0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006W"}, d2 = {"Leu/kanade/tachiyomi/extension/ar/mangapro/ProChan;", "Leu/kanade/tachiyomi/source/online/HttpSource;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "lang", "getLang", "domain", "baseUrl", "getBaseUrl", "supportsLatest", "", "getSupportsLatest", "()Z", "versionId", "", "getVersionId", "()I", "client", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "headersBuilder", "Lokhttp3/Headers$Builder;", "rscHeaders", "Lokhttp3/Headers;", "fetchPopularManga", "Lrx/Observable;", "Leu/kanade/tachiyomi/source/model/MangasPage;", "page", "fetchLatestUpdates", "pageNumber", "Ljava/util/concurrent/ConcurrentHashMap;", "searchKey", "query", "filters", "Leu/kanade/tachiyomi/source/model/FilterList;", "fetchSearchManga", "searchMangaRequest", "Lokhttp3/Request;", "getFilterList", "mangaDetailsRequest", "manga", "Leu/kanade/tachiyomi/source/model/SManga;", "getMangaUrl", "mangaDetailsParse", "response", "Lokhttp3/Response;", "chapterListRequest", "chapterListParse", "", "Leu/kanade/tachiyomi/source/model/SChapter;", "dateFormat", "Ljava/text/SimpleDateFormat;", "pageListRequest", "chapter", "getChapterUrl", "pageListParse", "Leu/kanade/tachiyomi/source/model/Page;", "imageRequest", "scrambledImageInterceptor", "chain", "Lokhttp3/Interceptor$Chain;", "sessionKey", "Lkotlin/Pair;", "", "sessionKeyLock", "", "decodeScrambledImageToken", "Leu/kanade/tachiyomi/extension/ar/mangapro/ScrambledImage;", "data", "Leu/kanade/tachiyomi/extension/ar/mangapro/ScrambledImageToken;", "urlSafeBase64", "", "countViews", "", "seriesId", "chapterId", "popularMangaRequest", "popularMangaParse", "latestUpdatesRequest", "latestUpdatesParse", "searchMangaParse", "imageUrlParse", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ProChan extends HttpSource {
    private final String name = "ProChan";
    private final String lang = "ar";
    private final String domain = "procomic.net";
private final String baseUrl = "https://procomic.net";
    private final boolean supportsLatest = true;
    private final int versionId = 5;
    private final OkHttpClient client = getNetwork().getCloudflareClient().newBuilder().addInterceptor(new Interceptor() { // from class: eu.kanade.tachiyomi.extension.ar.mangapro.ProChan$special$$inlined$-addInterceptor$1
        public final Response intercept(Interceptor.Chain chain) {
            Intrinsics.checkNotNullParameter(chain, "chain");
            return this.$receiver$inlined.scrambledImageInterceptor(chain);
        }
    }).addNetworkInterceptor(new CookieInterceptor("procomic.net", (List<Pair<String, String>>) CollectionsKt.listOf(new Pair[]{TuplesKt.to("safe_browsing", "off"), TuplesKt.to("language", "ar")}))).build();
    private final Headers rscHeaders = headersBuilder().set("rsc", "1").build();
    private final ConcurrentHashMap<String, Integer> pageNumber = new ConcurrentHashMap<>();
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.ROOT);
    private final ConcurrentHashMap<Integer, Pair<String, Long>> sessionKey = new ConcurrentHashMap<>();
    private final Object sessionKeyLock = new Object();

    public String getName() {
        return this.name;
    }

    public String getLang() {
        return this.lang;
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public boolean getSupportsLatest() {
        return this.supportsLatest;
    }

    public int getVersionId() {
        return this.versionId;
    }

    public OkHttpClient getClient() {
        return this.client;
    }

    protected Headers.Builder headersBuilder() {
        return super.headersBuilder().set("Referer", getBaseUrl() + "/").set("Origin", getBaseUrl());
    }

    public Observable<MangasPage> fetchPopularManga(int page) {
        Iterable filterList = getFilterList();
        for (Object obj : filterList) {
            if (obj instanceof SortFilter) {
                if (obj != null) {
                    ((SortFilter) obj).setState(2);
                    return fetchSearchManga(page, "", filterList);
                }
                throw new NullPointerException("null cannot be cast to non-null type eu.kanade.tachiyomi.extension.ar.mangapro.SortFilter");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public Observable<MangasPage> fetchLatestUpdates(int page) {
        Iterable filterList = getFilterList();
        for (Object obj : filterList) {
            if (obj instanceof SortFilter) {
                if (obj != null) {
                    ((SortFilter) obj).setState(1);
                    return fetchSearchManga(page, "", filterList);
                }
                throw new NullPointerException("null cannot be cast to non-null type eu.kanade.tachiyomi.extension.ar.mangapro.SortFilter");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final String searchKey(String query, FilterList filters) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) filters) {
            if (obj instanceof Filter) {
                arrayList.add(obj);
            }
        }
        return query + "::" + CollectionsKt.joinToString$default(arrayList, "|", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: eu.kanade.tachiyomi.extension.ar.mangapro.ProChan$$ExternalSyntheticLambda0
            public final Object invoke(Object obj2) {
                return ProChan.searchKey$lambda$0((Filter) obj2);
            }
        }, 30, (Object) null);
    }

    static final CharSequence searchKey$lambda$0(Filter filter) {
        Intrinsics.checkNotNullParameter(filter, "it");
        return String.valueOf(filter.getState());
    }

    public Observable<MangasPage> fetchSearchManga(int page, final String query, final FilterList filters) throws Exception {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(filters, "filters");
        if (StringsKt.startsWith$default(query, "https://", false, 2, (Object) null)) {
            HttpUrl httpUrl = HttpUrl.Companion.get(query);
            List listPathSegments = httpUrl.pathSegments();
            if (Intrinsics.areEqual(httpUrl.host(), this.domain) && listPathSegments.size() >= 4 && Intrinsics.areEqual(listPathSegments.get(0), "series")) {
                String str = (String) listPathSegments.get(1);
                if (!ProChanKt.SUPPORTED_TYPES.contains(str)) {
                    throw new Exception("نوع غير مدعوم");
                }
                String str2 = (String) listPathSegments.get(2);
                String str3 = (String) listPathSegments.get(3);
                SManga sMangaCreate = SManga.Companion.create();
                sMangaCreate.setUrl("/series/" + str + "/" + str2 + "/" + str3);
                Observable observableFetchMangaDetails = fetchMangaDetails(sMangaCreate);
                final Function1 function1 = new Function1() { // from class: eu.kanade.tachiyomi.extension.ar.mangapro.ProChan$$ExternalSyntheticLambda12
                    public final Object invoke(Object obj) {
                        return ProChan.fetchSearchManga$lambda$1((SManga) obj);
                    }
                };
                Observable<MangasPage> map = observableFetchMangaDetails.map(new Func1() { // from class: eu.kanade.tachiyomi.extension.ar.mangapro.ProChan$$ExternalSyntheticLambda13
                    public final Object call(Object obj) {
                        return ProChan.fetchSearchManga$lambda$2(function1, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return map;
            }
            throw new Exception("رابط غير مدعوم");
        }
        final String strSearchKey = searchKey(query, filters);
        if (page == 1) {
            this.pageNumber.put(strSearchKey, 1);
        }
        OkHttpClient client = getClient();
        Integer num = this.pageNumber.get(strSearchKey);
        Intrinsics.checkNotNull(num);
        Observable observableAsObservableSuccess = OkHttpExtensionsKt.asObservableSuccess(client.newCall(searchMangaRequest(num.intValue(), query, filters)));
        final Function1 function12 = new Function1() { // from class: eu.kanade.tachiyomi.extension.ar.mangapro.ProChan$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return ProChan.fetchSearchManga$lambda$3(filters, this, (Response) obj);
            }
        };
        Observable map2 = observableAsObservableSuccess.map(new Func1() { // from class: eu.kanade.tachiyomi.extension.ar.mangapro.ProChan$$ExternalSyntheticLambda2
            public final Object call(Object obj) {
                return ProChan.fetchSearchManga$lambda$4(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: eu.kanade.tachiyomi.extension.ar.mangapro.ProChan$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return ProChan.fetchSearchManga$lambda$5(this.f$0, strSearchKey, query, filters, (MangasPage) obj);
            }
        };
        Observable<MangasPage> observableFlatMap = map2.flatMap(new Func1() { // from class: eu.kanade.tachiyomi.extension.ar.mangapro.ProChan$$ExternalSyntheticLambda4
            public final Object call(Object obj) {
                return ProChan.fetchSearchManga$lambda$6(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        return observableFlatMap;
    }

    static final MangasPage fetchSearchManga$lambda$2(Function1 function1, Object obj) {
        return (MangasPage) function1.invoke(obj);
    }

    static final MangasPage fetchSearchManga$lambda$1(SManga sManga) {
        return new MangasPage(CollectionsKt.listOf(sManga), false);
    }

    static final MangasPage fetchSearchManga$lambda$4(Function1 function1, Object obj) {
        return (MangasPage) function1.invoke(obj);
    }

    static final MangasPage fetchSearchManga$lambda$3(FilterList filterList, final ProChan proChan, Response response) {
        Iterable iterable = (Iterable) filterList;
        for (Object obj : iterable) {
            if (obj instanceof StatusFilter) {
                if (obj != null) {
                    final String selected = ((StatusFilter) obj).getSelected();
                    for (Object obj2 : iterable) {
                        if (obj2 instanceof GenreFilter) {
                            if (obj2 != null) {
                                final GenreFilter genreFilter = (GenreFilter) obj2;
                                for (Object obj3 : iterable) {
                                    if (obj3 instanceof TagFilter) {
                                        if (obj3 != null) {
                                            final TagFilter tagFilter = (TagFilter) obj3;
                                            Intrinsics.checkNotNull(response);
                                            Json jsonInstance = JsonKt.getJsonInstance();
                                            Response response2 = (Closeable) response;
                                            try {
                                                InputStream inputStreamByteStream = response.body().byteStream();
                                                jsonInstance.getSerializersModule();
                                                Object objDecodeFromStream = JvmStreamsKt.decodeFromStream(jsonInstance, MetaData.INSTANCE.serializer(BrowseManga.INSTANCE.serializer()), inputStreamByteStream);
                                                CloseableKt.closeFinally(response2, (Throwable) null);
                                                MetaData metaData = (MetaData) objDecodeFromStream;
                                                return new MangasPage(SequencesKt.toList(SequencesKt.map(SequencesKt.filter(SequencesKt.filter(SequencesKt.filter(SequencesKt.filter(SequencesKt.filter(SequencesKt.filter(CollectionsKt.asSequence(metaData.getData()), new Function1() { // from class: eu.kanade.tachiyomi.extension.ar.mangapro.ProChan$$ExternalSyntheticLambda5
                                                    public final Object invoke(Object obj4) {
                                                        return Boolean.valueOf(ProChan.fetchSearchManga$lambda$3$0((BrowseManga) obj4));
                                                    }
                                                }), new Function1() { // from class: eu.kanade.tachiyomi.extension.ar.mangapro.ProChan$$ExternalSyntheticLambda6
                                                    public final Object invoke(Object obj4) {
                                                        return Boolean.valueOf(ProChan.fetchSearchManga$lambda$3$1(selected, (BrowseManga) obj4));
                                                    }
                                                }), new Function1() { // from class: eu.kanade.tachiyomi.extension.ar.mangapro.ProChan$$ExternalSyntheticLambda7
                                                    public final Object invoke(Object obj4) {
                                                        return Boolean.valueOf(ProChan.fetchSearchManga$lambda$3$2(genreFilter, (BrowseManga) obj4));
                                                    }
                                                }), new Function1() { // from class: eu.kanade.tachiyomi.extension.ar.mangapro.ProChan$$ExternalSyntheticLambda8
                                                    public final Object invoke(Object obj4) {
                                                        return Boolean.valueOf(ProChan.fetchSearchManga$lambda$3$3(genreFilter, (BrowseManga) obj4));
                                                    }
                                                }), new Function1() { // from class: eu.kanade.tachiyomi.extension.ar.mangapro.ProChan$$ExternalSyntheticLambda9
                                                    public final Object invoke(Object obj4) {
                                                        return Boolean.valueOf(ProChan.fetchSearchManga$lambda$3$4(tagFilter, (BrowseManga) obj4));
                                                    }
                                                }), new Function1() { // from class: eu.kanade.tachiyomi.extension.ar.mangapro.ProChan$$ExternalSyntheticLambda10
                                                    public final Object invoke(Object obj4) {
                                                        return Boolean.valueOf(ProChan.fetchSearchManga$lambda$3$5(tagFilter, (BrowseManga) obj4));
                                                    }
                                                }), new Function1() { // from class: eu.kanade.tachiyomi.extension.ar.mangapro.ProChan$$ExternalSyntheticLambda11
                                                    public final Object invoke(Object obj4) {
                                                        return ProChan.fetchSearchManga$lambda$3$6(this.f$0, (BrowseManga) obj4);
                                                    }
                                                })), metaData.getMeta().hasNextPage());
                                            } finally {
                                            }
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type eu.kanade.tachiyomi.extension.ar.mangapro.TagFilter");
                                        }
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            throw new NullPointerException("null cannot be cast to non-null type eu.kanade.tachiyomi.extension.ar.mangapro.GenreFilter");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                throw new NullPointerException("null cannot be cast to non-null type eu.kanade.tachiyomi.extension.ar.mangapro.StatusFilter");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fetchSearchManga$lambda$3$0(BrowseManga browseManga) {
        Intrinsics.checkNotNullParameter(browseManga, "manga");
        return ProChanKt.SUPPORTED_TYPES.contains(browseManga.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fetchSearchManga$lambda$3$1(String str, BrowseManga browseManga) {
        Intrinsics.checkNotNullParameter(browseManga, "manga");
        return str == null || Intrinsics.areEqual(browseManga.getProgress(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fetchSearchManga$lambda$3$2(GenreFilter genreFilter, BrowseManga browseManga) {
        Intrinsics.checkNotNullParameter(browseManga, "manga");
        return genreFilter.getIncluded().isEmpty() || browseManga.getMetadata().getGenres().containsAll(genreFilter.getIncluded());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fetchSearchManga$lambda$3$3(GenreFilter genreFilter, BrowseManga browseManga) {
        Intrinsics.checkNotNullParameter(browseManga, "manga");
        List<String> excluded = genreFilter.getExcluded();
        if ((excluded instanceof Collection) && excluded.isEmpty()) {
            return true;
        }
        Iterator<T> it = excluded.iterator();
        while (it.hasNext()) {
            if (browseManga.getMetadata().getGenres().contains((String) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fetchSearchManga$lambda$3$4(TagFilter tagFilter, BrowseManga browseManga) {
        Intrinsics.checkNotNullParameter(browseManga, "manga");
        return tagFilter.getIncluded().isEmpty() || browseManga.getMetadata().getTags().containsAll(tagFilter.getIncluded());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fetchSearchManga$lambda$3$5(TagFilter tagFilter, BrowseManga browseManga) {
        Intrinsics.checkNotNullParameter(browseManga, "manga");
        List<String> excluded = tagFilter.getExcluded();
        if ((excluded instanceof Collection) && excluded.isEmpty()) {
            return true;
        }
        Iterator<T> it = excluded.iterator();
        while (it.hasNext()) {
            if (browseManga.getMetadata().getTags().contains((String) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SManga fetchSearchManga$lambda$3$6(ProChan proChan, BrowseManga browseManga) {
        String coverImage;
        Intrinsics.checkNotNullParameter(browseManga, "manga");
        SManga sMangaCreate = SManga.Companion.create();
        sMangaCreate.setUrl("/series/" + browseManga.getType() + "/" + browseManga.getId() + "/" + browseManga.getSlug());
        sMangaCreate.setTitle(browseManga.getTitle());
        CoverImage coverImageApp = browseManga.getCoverImageApp();
        if (coverImageApp == null || (coverImage = coverImageApp.getDesktop()) == null) {
            coverImage = browseManga.getCoverImage();
        }
        String str = null;
        if (coverImage != null) {
            if (StringsKt.startsWith$default(coverImage, "/", false, 2, (Object) null)) {
                String cdn = browseManga.getCdn();
                if (cdn != null) {
                    coverImage = "https://" + cdn + "." + proChan.domain + coverImage;
                } else {
                    coverImage = null;
                }
            }
            str = coverImage;
        }
        sMangaCreate.setThumbnail_url(str);
        return sMangaCreate;
    }

    static final Observable fetchSearchManga$lambda$6(Function1 function1, Object obj) {
        return (Observable) function1.invoke(obj);
    }

    static final Observable fetchSearchManga$lambda$5(ProChan proChan, String str, String str2, FilterList filterList, MangasPage mangasPage) {
        if (mangasPage.getMangas().isEmpty() && mangasPage.getHasNextPage()) {
            ConcurrentHashMap<String, Integer> concurrentHashMap = proChan.pageNumber;
            ConcurrentHashMap<String, Integer> concurrentHashMap2 = concurrentHashMap;
            Integer num = concurrentHashMap.get(str);
            Intrinsics.checkNotNull(num);
            concurrentHashMap2.put(str, Integer.valueOf(num.intValue() + 1));
            Integer num2 = proChan.pageNumber.get(str);
            Intrinsics.checkNotNull(num2);
            return proChan.fetchSearchManga(num2.intValue(), str2, filterList);
        }
        if (!mangasPage.getHasNextPage()) {
            proChan.pageNumber.remove(str);
        }
        return Observable.just(mangasPage);
    }

    protected Request searchMangaRequest(int page, String query, FilterList filters) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(filters, "filters");
        HttpUrl.Builder builderNewBuilder = HttpUrl.Companion.get(getBaseUrl() + "/api/public/series/search").newBuilder();
        builderNewBuilder.addQueryParameter("status", "approved");
        builderNewBuilder.addQueryParameter("limit", "18");
        builderNewBuilder.addQueryParameter("page", String.valueOf(page));
        if (StringsKt.isBlank(query)) {
            query = null;
        }
        if (query != null) {
            builderNewBuilder.addQueryParameter("search", query);
        }
        Iterable iterable = (Iterable) filters;
        for (Object obj : iterable) {
            if (obj instanceof TypeFilter) {
                if (obj != null) {
                    String selected = ((TypeFilter) obj).getSelected();
                    if (selected != null) {
                        builderNewBuilder.addQueryParameter("type", selected);
                    }
                    for (Object obj2 : iterable) {
                        if (obj2 instanceof SortFilter) {
                            if (obj2 != null) {
                                builderNewBuilder.addQueryParameter("sort", ((SortFilter) obj2).getSelected());
                                for (Object obj3 : iterable) {
                                    if (obj3 instanceof YearFilter) {
                                        if (obj3 != null) {
                                            String selected2 = ((YearFilter) obj3).getSelected();
                                            if (selected2 != null) {
                                                builderNewBuilder.addQueryParameter("year", selected2);
                                            }
                                            return RequestsKt.GET$default(builderNewBuilder.build(), getHeaders(), (CacheControl) null, 4, (Object) null);
                                        }
                                        throw new NullPointerException("null cannot be cast to non-null type eu.kanade.tachiyomi.extension.ar.mangapro.YearFilter");
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            throw new NullPointerException("null cannot be cast to non-null type eu.kanade.tachiyomi.extension.ar.mangapro.SortFilter");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                throw new NullPointerException("null cannot be cast to non-null type eu.kanade.tachiyomi.extension.ar.mangapro.TypeFilter");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public FilterList getFilterList() {
        return new FilterList(new Filter[]{new TypeFilter(), new SortFilter(), new YearFilter(), new StatusFilter(), new GenreFilter(), new TagFilter()});
    }

    public Request mangaDetailsRequest(SManga manga) {
        Intrinsics.checkNotNullParameter(manga, "manga");
        return RequestsKt.GET$default(getMangaUrl(manga), this.rscHeaders, (CacheControl) null, 4, (Object) null);
    }

    public String getMangaUrl(SManga manga) {
        Intrinsics.checkNotNullParameter(manga, "manga");
        return getBaseUrl() + manga.getUrl();
    }

    protected Request chapterListRequest(SManga manga) {
        Intrinsics.checkNotNullParameter(manga, "manga");
        return RequestsKt.GET$default(getMangaUrl(manga), this.rscHeaders, (CacheControl) null, 4, (Object) null);
    }

    protected Request pageListRequest(SChapter chapter) {
        Intrinsics.checkNotNullParameter(chapter, "chapter");
        return RequestsKt.GET$default(getChapterUrl(chapter), this.rscHeaders, (CacheControl) null, 4, (Object) null);
    }

    public String getChapterUrl(SChapter chapter) {
        Object url;
        Intrinsics.checkNotNullParameter(chapter, "chapter");
        if (StringsKt.startsWith$default(chapter.getUrl(), "{", false, 2, (Object) null)) {
            String url2 = chapter.getUrl();
            Json jsonInstance = JsonKt.getJsonInstance();
            jsonInstance.getSerializersModule();
            url = jsonInstance.decodeFromString(ChapterUrl.INSTANCE.serializer(), url2);
        } else {
            url = chapter.getUrl();
        }
        return getBaseUrl() + url;
    }

    protected List<Page> pageListParse(Response response) throws Exception {
        SerialDescriptor descriptor;
        SerialDescriptor descriptor2;
        Intrinsics.checkNotNullParameter(response, "response");
        String strString = response.body().string();
        boolean zAreEqual = Intrinsics.areEqual(Reflection.typeOf(Images.class).getClassifier(), Reflection.getOrCreateKotlinClass(List.class));
        int i = 0;
        if (zAreEqual) {
            KSerializer kSerializerSerializer = SerializersKt.serializer(Reflection.typeOf(Images.class));
            Intrinsics.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            descriptor = kSerializerSerializer.getDescriptor().getElementDescriptor(0);
        } else {
            KSerializer kSerializerSerializer2 = SerializersKt.serializer(Reflection.typeOf(Images.class));
            Intrinsics.checkNotNull(kSerializerSerializer2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            descriptor = kSerializerSerializer2.getDescriptor();
        }
        Iterable iterableUntil = RangesKt.until(0, descriptor.getElementsCount());
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterableUntil) {
            int iIntValue = ((Number) obj).intValue();
            if (!descriptor.isElementOptional(iIntValue) && !descriptor.getElementDescriptor(iIntValue).isNullable()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(descriptor.getElementName(((Number) it.next()).intValue()));
        }
        final Set set = CollectionsKt.toSet(arrayList3);
        if (set.isEmpty()) {
            throw new IllegalArgumentException(("Cannot infer a predicate for " + descriptor.getSerialName() + ": all fields are optional or nullable. Provide an explicit predicate instead.").toString());
        }
        Function1<JsonElement, Boolean> function1 = zAreEqual ? new Function1<JsonElement, Boolean>() { // from class: eu.kanade.tachiyomi.extension.ar.mangapro.ProChan$pageListParse$$inlined$extractNextJsRsc$1
            /* JADX WARN: Removed duplicated region for block: B:20:0x0053 A[EDGE_INSN: B:20:0x0053->B:21:0x0054 BREAK  A[LOOP:0: B:14:0x0032->B:25:?]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Boolean invoke(kotlinx.serialization.json.JsonElement r4) {
                /*
                    r3 = this;
                    java.lang.String r0 = "element"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                    boolean r0 = r4 instanceof kotlinx.serialization.json.JsonArray
                    if (r0 == 0) goto L53
                    r0 = r4
                    java.util.Collection r0 = (java.util.Collection) r0
                    boolean r0 = r0.isEmpty()
                    if (r0 != 0) goto L53
                    java.util.List r4 = (java.util.List) r4
                    java.lang.Object r0 = kotlin.collections.CollectionsKt.first(r4)
                    boolean r0 = r0 instanceof kotlinx.serialization.json.JsonObject
                    if (r0 == 0) goto L53
                    java.util.Set r0 = r1
                    java.lang.Iterable r0 = (java.lang.Iterable) r0
                    boolean r1 = r0 instanceof java.util.Collection
                    if (r1 == 0) goto L2e
                    r1 = r0
                    java.util.Collection r1 = (java.util.Collection) r1
                    boolean r1 = r1.isEmpty()
                    if (r1 == 0) goto L2e
                    goto L51
                L2e:
                    java.util.Iterator r0 = r0.iterator()
                L32:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L51
                    java.lang.Object r1 = r0.next()
                    java.lang.String r1 = (java.lang.String) r1
                    java.lang.Object r2 = kotlin.collections.CollectionsKt.first(r4)
                    kotlinx.serialization.json.JsonElement r2 = (kotlinx.serialization.json.JsonElement) r2
                    kotlinx.serialization.json.JsonObject r2 = kotlinx.serialization.json.JsonElementKt.getJsonObject(r2)
                    java.util.Map r2 = (java.util.Map) r2
                    boolean r1 = r2.containsKey(r1)
                    if (r1 != 0) goto L32
                    goto L53
                L51:
                    r4 = 1
                    goto L54
                L53:
                    r4 = 0
                L54:
                    java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: eu.kanade.tachiyomi.extension.ar.mangapro.ProChan$pageListParse$$inlined$extractNextJsRsc$1.invoke(kotlinx.serialization.json.JsonElement):java.lang.Boolean");
            }
        } : new Function1<JsonElement, Boolean>() { // from class: eu.kanade.tachiyomi.extension.ar.mangapro.ProChan$pageListParse$$inlined$extractNextJsRsc$2
            public final Boolean invoke(JsonElement jsonElement) {
                boolean z;
                Intrinsics.checkNotNullParameter(jsonElement, "element");
                if (!(jsonElement instanceof JsonObject)) {
                    z = false;
                    break;
                }
                Set set2 = set;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    Iterator it2 = set2.iterator();
                    while (it2.hasNext()) {
                        if (!((Map) jsonElement).containsKey((String) it2.next())) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                return Boolean.valueOf(z);
            }
        };
        DeserializationStrategy deserializationStrategySerializer = SerializersKt.serializer(Reflection.typeOf(Images.class));
        Intrinsics.checkNotNull(deserializationStrategySerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        Images images = (Images) NextJsKt.extractNextJsRsc(strString, function1, deserializationStrategySerializer);
        if (images == null) {
            boolean zAreEqual2 = Intrinsics.areEqual(Reflection.typeOf(Coins.class).getClassifier(), Reflection.getOrCreateKotlinClass(List.class));
            if (zAreEqual2) {
                KSerializer kSerializerSerializer3 = SerializersKt.serializer(Reflection.typeOf(Coins.class));
                Intrinsics.checkNotNull(kSerializerSerializer3, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                descriptor2 = kSerializerSerializer3.getDescriptor().getElementDescriptor(0);
            } else {
                KSerializer kSerializerSerializer4 = SerializersKt.serializer(Reflection.typeOf(Coins.class));
                Intrinsics.checkNotNull(kSerializerSerializer4, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                descriptor2 = kSerializerSerializer4.getDescriptor();
            }
            Iterable iterableUntil2 = RangesKt.until(0, descriptor2.getElementsCount());
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : iterableUntil2) {
                int iIntValue2 = ((Number) obj2).intValue();
                if (!descriptor2.isElementOptional(iIntValue2) && !descriptor2.getElementDescriptor(iIntValue2).isNullable()) {
                    arrayList4.add(obj2);
                }
            }
            ArrayList arrayList5 = arrayList4;
            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
            Iterator it2 = arrayList5.iterator();
            while (it2.hasNext()) {
                arrayList6.add(descriptor2.getElementName(((Number) it2.next()).intValue()));
            }
            final Set set2 = CollectionsKt.toSet(arrayList6);
            if (set2.isEmpty()) {
                throw new IllegalArgumentException(("Cannot infer a predicate for " + descriptor2.getSerialName() + ": all fields are optional or nullable. Provide an explicit predicate instead.").toString());
            }
            Function1<JsonElement, Boolean> function12 = zAreEqual2 ? new Function1<JsonElement, Boolean>() { // from class: eu.kanade.tachiyomi.extension.ar.mangapro.ProChan$pageListParse$$inlined$extractNextJsRsc$3
                /* JADX WARN: Removed duplicated region for block: B:20:0x0053 A[EDGE_INSN: B:20:0x0053->B:21:0x0054 BREAK  A[LOOP:0: B:14:0x0032->B:25:?]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Boolean invoke(kotlinx.serialization.json.JsonElement r4) {
                    /*
                        r3 = this;
                        java.lang.String r0 = "element"
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                        boolean r0 = r4 instanceof kotlinx.serialization.json.JsonArray
                        if (r0 == 0) goto L53
                        r0 = r4
                        java.util.Collection r0 = (java.util.Collection) r0
                        boolean r0 = r0.isEmpty()
                        if (r0 != 0) goto L53
                        java.util.List r4 = (java.util.List) r4
                        java.lang.Object r0 = kotlin.collections.CollectionsKt.first(r4)
                        boolean r0 = r0 instanceof kotlinx.serialization.json.JsonObject
                        if (r0 == 0) goto L53
                        java.util.Set r0 = r1
                        java.lang.Iterable r0 = (java.lang.Iterable) r0
                        boolean r1 = r0 instanceof java.util.Collection
                        if (r1 == 0) goto L2e
                        r1 = r0
                        java.util.Collection r1 = (java.util.Collection) r1
                        boolean r1 = r1.isEmpty()
                        if (r1 == 0) goto L2e
                        goto L51
                    L2e:
                        java.util.Iterator r0 = r0.iterator()
                    L32:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L51
                        java.lang.Object r1 = r0.next()
                        java.lang.String r1 = (java.lang.String) r1
                        java.lang.Object r2 = kotlin.collections.CollectionsKt.first(r4)
                        kotlinx.serialization.json.JsonElement r2 = (kotlinx.serialization.json.JsonElement) r2
                        kotlinx.serialization.json.JsonObject r2 = kotlinx.serialization.json.JsonElementKt.getJsonObject(r2)
                        java.util.Map r2 = (java.util.Map) r2
                        boolean r1 = r2.containsKey(r1)
                        if (r1 != 0) goto L32
                        goto L53
                    L51:
                        r4 = 1
                        goto L54
                    L53:
                        r4 = 0
                    L54:
                        java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: eu.kanade.tachiyomi.extension.ar.mangapro.ProChan$pageListParse$$inlined$extractNextJsRsc$3.invoke(kotlinx.serialization.json.JsonElement):java.lang.Boolean");
                }
            } : new Function1<JsonElement, Boolean>() { // from class: eu.kanade.tachiyomi.extension.ar.mangapro.ProChan$pageListParse$$inlined$extractNextJsRsc$4
                public final Boolean invoke(JsonElement jsonElement) {
                    boolean z;
                    Intrinsics.checkNotNullParameter(jsonElement, "element");
                    if (!(jsonElement instanceof JsonObject)) {
                        z = false;
                        break;
                    }
                    Set set3 = set2;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        Iterator it3 = set3.iterator();
                        while (it3.hasNext()) {
                            if (!((Map) jsonElement).containsKey((String) it3.next())) {
                                z = false;
                                break;
                            }
                        }
                    }
                    z = true;
                    return Boolean.valueOf(z);
                }
            };
            DeserializationStrategy deserializationStrategySerializer2 = SerializersKt.serializer(Reflection.typeOf(Coins.class));
            Intrinsics.checkNotNull(deserializationStrategySerializer2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            Coins coins = (Coins) NextJsKt.extractNextJsRsc(strString, function12, deserializationStrategySerializer2);
            Integer numValueOf = coins != null ? Integer.valueOf(coins.getCoins()) : null;
            if (numValueOf == null || numValueOf.intValue() <= 0) {
                return CollectionsKt.emptyList();
            }
            throw new Exception("فصل مدفوع");
        }
        String str = (String) response.request().url().pathSegments().get(2);
        String str2 = (String) response.request().url().pathSegments().get(4);
        List mutableList = CollectionsKt.toMutableList(images.getImages());
        ArrayList arrayList7 = new ArrayList();
        if (images.getDeferredMedia() != null) {
            Response responseExecute = getClient().newCall(RequestsKt.GET$default(HttpUrl.Companion.get(getBaseUrl()).newBuilder().addPathSegment("chapter-deferred-media").addPathSegment(str2).addQueryParameter("token", images.getDeferredMedia().getToken()).build(), getHeaders(), (CacheControl) null, 4, (Object) null)).execute();
            Json jsonInstance = JsonKt.getJsonInstance();
            Response response2 = (Closeable) responseExecute;
            try {
                InputStream inputStreamByteStream = responseExecute.body().byteStream();
                jsonInstance.getSerializersModule();
                Object objDecodeFromStream = JvmStreamsKt.decodeFromStream(jsonInstance, Data.INSTANCE.serializer(DeferredImages.INSTANCE.serializer()), inputStreamByteStream);
                CloseableKt.closeFinally(response2, (Throwable) null);
                Data data = (Data) objDecodeFromStream;
                mutableList.addAll(((DeferredImages) data.getData()).getImages());
                arrayList7.addAll(((DeferredImages) data.getData()).getMaps());
            } finally {
            }
        }
        countViews(str, str2);
        String string = response.request().url().toString();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = arrayList8;
        int i2 = 0;
        for (Object obj3 : mutableList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList9.add(new Page(i2, string, (String) obj3, (Uri) null, 8, (DefaultConstructorMarker) null));
            i2 = i3;
        }
        for (Object obj4 : arrayList7) {
            int i4 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int size = arrayList8.size() + i;
            StringFormat jsonInstance2 = JsonKt.getJsonInstance();
            jsonInstance2.getSerializersModule();
            arrayList9.add(new Page(size, string, "http://127.0.0.1/#" + jsonInstance2.encodeToString(ScrambledData.INSTANCE.serializer(), (ScrambledData) obj4), (Uri) null, 8, (DefaultConstructorMarker) null));
            i = i4;
        }
        return arrayList8;
    }

    protected Request imageRequest(Page page) {
        Intrinsics.checkNotNullParameter(page, "page");
        Headers headersBuild = headersBuilder().set("Referer", page.getUrl()).build();
        String imageUrl = page.getImageUrl();
        Intrinsics.checkNotNull(imageUrl);
        return RequestsKt.GET$default(imageUrl, headersBuild, (CacheControl) null, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Response scrambledImageInterceptor(Interceptor.Chain chain) throws Exception {
        ProChan proChan;
        ScrambledImage scrambledImageDecodeScrambledImageToken;
        Request request = chain.request();
        HttpUrl httpUrlUrl = request.url();
        if (!Intrinsics.areEqual(httpUrlUrl.host(), "127.0.0.1")) {
            return chain.proceed(request);
        }
        String strHeader = request.header("Referer");
        Intrinsics.checkNotNull(strHeader);
        String str = (String) HttpUrl.Companion.get(strHeader).pathSegments().get(1);
        String str2 = Intrinsics.areEqual(str, "manga") ? "cdn1" : Intrinsics.areEqual(str, "manhua") ? "cdn2" : "cdn3";
        String strFragment = httpUrlUrl.fragment();
        Intrinsics.checkNotNull(strFragment);
        Json jsonInstance = JsonKt.getJsonInstance();
        jsonInstance.getSerializersModule();
        ScrambledData scrambledData = (ScrambledData) jsonInstance.decodeFromString(ScrambledData.INSTANCE.serializer(), strFragment);
        if (scrambledData instanceof ScrambledImage) {
            scrambledImageDecodeScrambledImageToken = (ScrambledImage) scrambledData;
            proChan = this;
        } else {
            if (!(scrambledData instanceof ScrambledImageToken)) {
                throw new NoWhenBranchMatchedException();
            }
            proChan = this;
            scrambledImageDecodeScrambledImageToken = proChan.decodeScrambledImageToken((ScrambledImageToken) scrambledData);
        }
        List listSplit$default = StringsKt.split$default(scrambledImageDecodeScrambledImageToken.getMode(), new String[]{"_"}, false, 2, 2, (Object) null);
        String str3 = (String) listSplit$default.get(0);
        String str4 = (String) listSplit$default.get(1);
        if (scrambledImageDecodeScrambledImageToken.getDim().size() < 2) {
            throw new IllegalArgumentException(("Invalid dim: " + scrambledImageDecodeScrambledImageToken.getDim()).toString());
        }
        int iIntValue = scrambledImageDecodeScrambledImageToken.getDim().get(0).intValue();
        int iIntValue2 = scrambledImageDecodeScrambledImageToken.getDim().get(1).intValue();
        List<Integer> order = scrambledImageDecodeScrambledImageToken.getOrder();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(order, 10));
        Iterator<T> it = order.iterator();
        while (it.hasNext()) {
            arrayList.add(scrambledImageDecodeScrambledImageToken.getPieces().get(((Number) it.next()).intValue()));
        }
        List list = (List) BuildersKt.runBlocking$default((CoroutineContext) null, new ProChan$scrambledImageInterceptor$pieceBitmaps$1(arrayList, str2, proChan, strHeader, request, null), 1, (Object) null);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue, iIntValue2, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        try {
            if (Intrinsics.areEqual(str3, "vertical")) {
                Iterator it2 = list.iterator();
                float width = 0.0f;
                while (it2.hasNext()) {
                    canvas.drawBitmap((Bitmap) it2.next(), width, 0.0f, (Paint) null);
                    width += r8.getWidth();
                }
            } else {
                if (!Intrinsics.areEqual(str3, "grid")) {
                    throw new IOException("Unknown puzzle mode: " + str3);
                }
                List listSplit$default2 = StringsKt.split$default(str4, new char[]{'x'}, false, 2, 2, (Object) null);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default2, 10));
                Iterator it3 = listSplit$default2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(Integer.valueOf(Integer.parseInt((String) it3.next())));
                }
                ArrayList arrayList3 = arrayList2;
                int iIntValue3 = ((Number) arrayList3.get(0)).intValue();
                int iIntValue4 = ((Number) arrayList3.get(1)).intValue();
                float f = 0.0f;
                for (int i = 0; i < iIntValue4; i++) {
                    float fMax = 0.0f;
                    float width2 = 0.0f;
                    for (int i2 = 0; i2 < iIntValue3; i2++) {
                        int i3 = (i * iIntValue3) + i2;
                        if (i3 < list.size()) {
                            canvas.drawBitmap((Bitmap) list.get(i3), width2, f, (Paint) null);
                            width2 += r14.getWidth();
                            fMax = Math.max(fMax, r14.getHeight());
                        }
                    }
                    f += fMax;
                }
            }
            BufferedSource buffer = new Buffer();
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 90, buffer.outputStream());
            return new Response.Builder().request(request).protocol(Protocol.HTTP_1_1).code(200).message("OK").body(ResponseBody.Companion.create(buffer, MediaType.Companion.get("image/jpg"), buffer.size())).build();
        } finally {
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                ((Bitmap) it4.next()).recycle();
            }
            bitmapCreateBitmap.recycle();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c2 A[Catch: all -> 0x01a2, TRY_LEAVE, TryCatch #0 {, blocks: (B:13:0x0091, B:15:0x00a8, B:20:0x00ba, B:25:0x0152, B:22:0x00c2, B:24:0x011d, B:33:0x019e, B:34:0x01a1, B:23:0x00fd, B:31:0x019c), top: B:40:0x0091, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final eu.kanade.tachiyomi.extension.ar.mangapro.ScrambledImage decodeScrambledImageToken(eu.kanade.tachiyomi.extension.ar.mangapro.ScrambledImageToken r14) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: eu.kanade.tachiyomi.extension.ar.mangapro.ProChan.decodeScrambledImageToken(eu.kanade.tachiyomi.extension.ar.mangapro.ScrambledImageToken):eu.kanade.tachiyomi.extension.ar.mangapro.ScrambledImage");
    }

    private final byte[] urlSafeBase64(String data) {
        return Base64.decode$default(Base64.Default.getUrlSafe().withPadding(Base64.PaddingOption.PRESENT_OPTIONAL), data, 0, 0, 6, (Object) null);
    }

    static /* synthetic */ void countViews$default(ProChan proChan, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        proChan.countViews(str, str2);
    }

    private final void countViews(String seriesId, String chapterId) {
        String str;
        String str2;
        String str3 = getHeaders().get("User-Agent");
        Intrinsics.checkNotNull(str3);
        RequestBody.Companion companion = RequestBody.Companion;
        Integer numValueOf = chapterId != null ? Integer.valueOf(Integer.parseInt(chapterId)) : null;
        int i = Integer.parseInt(seriesId);
        String str4 = str3;
        if (ProChanKt.MOBILE_REGEX.containsMatchIn(str4)) {
            str = "mobile";
        } else {
            str = ProChanKt.TABLES_REGEX.containsMatchIn(str4) ? "tablet" : "desktop";
        }
        if (chapterId == null) {
            str2 = "series";
        } else {
            str2 = "chapter";
        }
        ViewsDto viewsDto = new ViewsDto(numValueOf, i, str, str2);
        StringFormat jsonInstance = JsonKt.getJsonInstance();
        jsonInstance.getSerializersModule();
        RequestBody requestBodyCreate = companion.create(jsonInstance.encodeToString(ViewsDto.INSTANCE.serializer(), viewsDto), ProChanKt.JSON_MEDIA_TYPE);
        getClient().newCall(RequestsKt.POST$default(getBaseUrl() + "/api/views", getHeaders(), requestBodyCreate, (CacheControl) null, 8, (Object) null)).enqueue(new Callback() { // from class: eu.kanade.tachiyomi.extension.ar.mangapro.ProChan.countViews.1
            public void onResponse(Call call, Response response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                if (!response.isSuccessful()) {
                    Log.e(ProChan.this.getName(), "Failed to count views, HTTP " + response.code());
                }
                _UtilCommonKt.closeQuietly((Closeable) response);
            }

            public void onFailure(Call call, IOException e) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(e, "e");
                Log.e(ProChan.this.getName(), "Failed to count views", e);
            }
        });
    }

    protected Request popularMangaRequest(int page) {
        throw new UnsupportedOperationException();
    }

    protected MangasPage popularMangaParse(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        throw new UnsupportedOperationException();
    }

    protected Request latestUpdatesRequest(int page) {
        throw new UnsupportedOperationException();
    }

    protected MangasPage latestUpdatesParse(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        throw new UnsupportedOperationException();
    }

    protected MangasPage searchMangaParse(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        throw new UnsupportedOperationException();
    }

    protected String imageUrlParse(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x045a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected eu.kanade.tachiyomi.source.model.SManga mangaDetailsParse(okhttp3.Response r21) {
        /*
            Method dump skipped, instruction units count: 1158
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: eu.kanade.tachiyomi.extension.ar.mangapro.ProChan.mangaDetailsParse(okhttp3.Response):eu.kanade.tachiyomi.source.model.SManga");
    }

    protected List<SChapter> chapterListParse(Response response) throws Exception {
        SerialDescriptor descriptor;
        String string;
        Intrinsics.checkNotNullParameter(response, "response");
        boolean zAreEqual = Intrinsics.areEqual(Reflection.typeOf(InitialChapters.class).getClassifier(), Reflection.getOrCreateKotlinClass(List.class));
        if (zAreEqual) {
            KSerializer kSerializerSerializer = SerializersKt.serializer(Reflection.typeOf(InitialChapters.class));
            Intrinsics.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            descriptor = kSerializerSerializer.getDescriptor().getElementDescriptor(0);
        } else {
            KSerializer kSerializerSerializer2 = SerializersKt.serializer(Reflection.typeOf(InitialChapters.class));
            Intrinsics.checkNotNull(kSerializerSerializer2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            descriptor = kSerializerSerializer2.getDescriptor();
        }
        Iterable iterableUntil = RangesKt.until(0, descriptor.getElementsCount());
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterableUntil) {
            int iIntValue = ((Number) obj).intValue();
            if (!descriptor.isElementOptional(iIntValue) && !descriptor.getElementDescriptor(iIntValue).isNullable()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(descriptor.getElementName(((Number) it.next()).intValue()));
        }
        final Set set = CollectionsKt.toSet(arrayList3);
        if (set.isEmpty()) {
            throw new IllegalArgumentException(("Cannot infer a predicate for " + descriptor.getSerialName() + ": all fields are optional or nullable. Provide an explicit predicate instead.").toString());
        }
        Function1<JsonElement, Boolean> function1 = zAreEqual ? new Function1<JsonElement, Boolean>() { // from class: eu.kanade.tachiyomi.extension.ar.mangapro.ProChan$chapterListParse$$inlined$extractNextJs$1
            /* JADX WARN: Removed duplicated region for block: B:20:0x0053 A[EDGE_INSN: B:20:0x0053->B:21:0x0054 BREAK  A[LOOP:0: B:14:0x0032->B:25:?]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Boolean invoke(kotlinx.serialization.json.JsonElement r4) {
                /*
                    r3 = this;
                    java.lang.String r0 = "element"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                    boolean r0 = r4 instanceof kotlinx.serialization.json.JsonArray
                    if (r0 == 0) goto L53
                    r0 = r4
                    java.util.Collection r0 = (java.util.Collection) r0
                    boolean r0 = r0.isEmpty()
                    if (r0 != 0) goto L53
                    java.util.List r4 = (java.util.List) r4
                    java.lang.Object r0 = kotlin.collections.CollectionsKt.first(r4)
                    boolean r0 = r0 instanceof kotlinx.serialization.json.JsonObject
                    if (r0 == 0) goto L53
                    java.util.Set r0 = r1
                    java.lang.Iterable r0 = (java.lang.Iterable) r0
                    boolean r1 = r0 instanceof java.util.Collection
                    if (r1 == 0) goto L2e
                    r1 = r0
                    java.util.Collection r1 = (java.util.Collection) r1
                    boolean r1 = r1.isEmpty()
                    if (r1 == 0) goto L2e
                    goto L51
                L2e:
                    java.util.Iterator r0 = r0.iterator()
                L32:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L51
                    java.lang.Object r1 = r0.next()
                    java.lang.String r1 = (java.lang.String) r1
                    java.lang.Object r2 = kotlin.collections.CollectionsKt.first(r4)
                    kotlinx.serialization.json.JsonElement r2 = (kotlinx.serialization.json.JsonElement) r2
                    kotlinx.serialization.json.JsonObject r2 = kotlinx.serialization.json.JsonElementKt.getJsonObject(r2)
                    java.util.Map r2 = (java.util.Map) r2
                    boolean r1 = r2.containsKey(r1)
                    if (r1 != 0) goto L32
                    goto L53
                L51:
                    r4 = 1
                    goto L54
                L53:
                    r4 = 0
                L54:
                    java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: eu.kanade.tachiyomi.extension.ar.mangapro.ProChan$chapterListParse$$inlined$extractNextJs$1.invoke(kotlinx.serialization.json.JsonElement):java.lang.Boolean");
            }
        } : new Function1<JsonElement, Boolean>() { // from class: eu.kanade.tachiyomi.extension.ar.mangapro.ProChan$chapterListParse$$inlined$extractNextJs$2
            public final Boolean invoke(JsonElement jsonElement) {
                boolean z;
                Intrinsics.checkNotNullParameter(jsonElement, "element");
                if (!(jsonElement instanceof JsonObject)) {
                    z = false;
                    break;
                }
                Set set2 = set;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    Iterator it2 = set2.iterator();
                    while (it2.hasNext()) {
                        if (!((Map) jsonElement).containsKey((String) it2.next())) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                return Boolean.valueOf(z);
            }
        };
        DeserializationStrategy deserializationStrategySerializer = SerializersKt.serializer(Reflection.typeOf(InitialChapters.class));
        Intrinsics.checkNotNull(deserializationStrategySerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        Object objExtractNextJs = NextJsKt.extractNextJs(response, (Function1<? super JsonElement, Boolean>) function1, (DeserializationStrategy<? extends Object>) deserializationStrategySerializer);
        Intrinsics.checkNotNull(objExtractNextJs);
        InitialChapters initialChapters = (InitialChapters) objExtractNextJs;
        List mutableList = CollectionsKt.toMutableList(initialChapters.getInitialChapters());
        int size = mutableList.size();
        String str = (String) response.request().url().pathSegments().get(1);
        String str2 = (String) response.request().url().pathSegments().get(2);
        String str3 = (String) response.request().url().pathSegments().get(3);
        int i = 2;
        while (initialChapters.getTotalChapters() > mutableList.size()) {
            int i2 = i + 1;
            Response responseExecute = getClient().newCall(RequestsKt.GET$default(getBaseUrl() + "/api/public/" + str + "/" + str2 + "/chapters?page=" + i + "&limit=" + size + "&order=desc", getHeaders(), (CacheControl) null, 4, (Object) null)).execute();
            if (!responseExecute.isSuccessful()) {
                responseExecute.close();
                throw new Exception("HTTP " + responseExecute.code());
            }
            Json jsonInstance = JsonKt.getJsonInstance();
            Response response2 = (Closeable) responseExecute;
            try {
                InputStream inputStreamByteStream = responseExecute.body().byteStream();
                jsonInstance.getSerializersModule();
                Object objDecodeFromStream = JvmStreamsKt.decodeFromStream(jsonInstance, Data.INSTANCE.serializer(new ArrayListSerializer(Chapter.INSTANCE.serializer())), inputStreamByteStream);
                CloseableKt.closeFinally(response2, (Throwable) null);
                mutableList.addAll((Collection) ((Data) objDecodeFromStream).getData());
                i = i2;
            } finally {
            }
        }
        countViews$default(this, str2, null, 2, null);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : mutableList) {
            if (Intrinsics.areEqual(((Chapter) obj2).getLanguage(), "AR")) {
                arrayList4.add(obj2);
            }
        }
        ArrayList<Chapter> arrayList5 = arrayList4;
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
        for (Chapter chapter : arrayList5) {
            SChapter sChapterCreate = SChapter.Companion.create();
            sChapterCreate.setUrl("/series/" + str + "/" + str2 + "/" + str3 + "/" + chapter.getId() + "/" + chapter.getNumber());
            StringBuilder sb = new StringBuilder("\u200f");
            if (chapter.getCoins() != null && chapter.getCoins().intValue() > 0) {
                sb.append("🔒 ");
            }
            sb.append("الفصل ");
            sb.append(StringsKt.substringBefore$default(String.valueOf(Float.parseFloat(chapter.getNumber())), ".0", (String) null, 2, (Object) null));
            String title = chapter.getTitle();
            if (title != null && (string = StringsKt.trim(title).toString()) != null) {
                if (StringsKt.isBlank(string)) {
                    string = null;
                }
                if (string != null && !Intrinsics.areEqual(string, StringsKt.trim(chapter.getNumber()).toString()) && !Intrinsics.areEqual(string, chapter.getNumber())) {
                    sb.append(" \u200f- ");
                    sb.append(string);
                }
            }
            sChapterCreate.setName(sb.toString());
            String uploader = chapter.getUploader();
            if (uploader == null) {
                uploader = "\u200b";
            }
            sChapterCreate.setScanlator(uploader);
            sChapterCreate.setChapter_number(Float.parseFloat(chapter.getNumber()));
            SimpleDateFormat simpleDateFormat = this.dateFormat;
            String createdAt = chapter.getCreatedAt();
            long time = 0;
            if (createdAt != null) {
                try {
                    Date date = simpleDateFormat.parse(createdAt);
                    if (date != null) {
                        time = date.getTime();
                    }
                } catch (ParseException unused) {
                }
            }
            sChapterCreate.setDate_upload(time);
            arrayList6.add(sChapterCreate);
        }
        return CollectionsKt.sortedWith(arrayList6, new Comparator() { // from class: eu.kanade.tachiyomi.extension.ar.mangapro.ProChan$chapterListParse$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Float.valueOf(((SChapter) t2).getChapter_number()), Float.valueOf(((SChapter) t).getChapter_number()));
            }
        });
    }
}
