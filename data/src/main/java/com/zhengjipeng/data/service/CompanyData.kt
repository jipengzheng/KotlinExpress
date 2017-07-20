package com.zhengjipeng.data.service

/**
 * Created by zhengjipeng on 2017/7/19.
 */
object CompanyData {
    const val BaseImageUrl = "https://www.kuaidi100.com/images/all/56/"

    var data: HashMap<String, String>
    init {
        data = HashMap()
        data.put("SF", "shunfeng.png")
        data.put("HTKY", "huitongkuaidi.png")
        data.put("ZTO", "zhongtong.png")
        data.put("STO", "shentong.png")
        data.put("YTO", "yuantong.png")
        data.put("EMS", "ems.png")
        data.put("JD", "jd.png")
        data.put("ZJS", "zhaijisong.png")
        data.put("DBL", "debangwuliu.png")
        data.put("ANE", "annengwuliu.png")
        data.put("AXD", "anxl.png")
        data.put("BTWL", "huitongkuaidi.png")
        data.put("CJKD", "chengjisudi.png")
        data.put("CITY100", "city100.png")
        data.put("DBL", "debangwuliu.png")
        data.put("DSWL", "disifang.png")
        data.put("DTWL", "coe.png")
        data.put("EWE", "emsguoji.png")
        data.put("EMS", "ems.png")
        data.put("FEDEX", "fedex.png")
        data.put("FKD", "feikangda.png")
        data.put("GTSD", "hre.png")
        data.put("GSD", "gongsuda.png")
        data.put("GTO", "guotongkuaidi.png")
        data.put("HLYSD", "hlyex.png")
        data.put("HLWL", "hengluwuliu.png")
        data.put("HXLWL", "huaxialongwuliu.png")
        data.put("JXD", "jixianda.png")
        data.put("JJKY", "jiajiwuliu.png")
        data.put("JYM", "jiayunmeiwuliu.png")
        data.put("LHT", "lianhaowuliu.png")
        data.put("LB", "longbanwuliu.png")
        data.put("MB", "minbangsudi.png")
        data.put("MHKD", "minghangkuaidi.png")
        data.put("NEDA", "ganzhongnengda.png")
        data.put("PADTF", "pingandatengfei.png")
        data.put("QFKD", "quanfengkuaidi.png")
        data.put("QRT", "quanritongkuaidi.png")
        data.put("REF", "rufengda.png")
        data.put("RFEX", "rfsd_logo.gif")
        data.put("ST", "shentong.png")
        data.put("SHWL", "shenghuiwuliu.png")
        data.put("SURE", "suer.png")
        data.put("HHTT", "tiantian.png")
        data.put("WJWL", "wanjiawuliu.png")
        data.put("WXWL", "wanxiangwuliu.png")
        data.put("XYT", "xiyoutekuaidi.png")
        data.put("XBWL", "xinbangwuliu.png")
        data.put("XFWL", "xinfengwuliu.png")
        data.put("YFSD", "yafengsudi.png")
        data.put("YZPY", "56/youzhengguonei.png")
        data.put("YCWL", "56/yuanchengwuliu.png")
        data.put("YTO", "yuantong.png")
        data.put("YD", "yunda.png")
        data.put("YTKD", "ytkd.png")
        data.put("ZYNY", "zengyisudi.png")
        data.put("ZJS", "zhaijisong.png")
        data.put("ZTKY", "zhongtiewuliu.png")
        data.put("ZTO", "zhongtong.png")
        data.put("ZYWL", "zhongyouwuliu.png")
    }

    fun getLastName(code: String): String? {
        return data.get(code)
    }
}