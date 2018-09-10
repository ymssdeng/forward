package me.forward.dts;

import com.google.common.collect.Range;
import java.util.List;
import me.forward.dts.model.Record;

/**
 * @author denghui
 * @create 2018/9/10
 */
public interface QuerySplitRunner {

    Range<String> getMinMaxId();

    List<String> splitId(Range<String> range);

    List<Record> query(Range<String> range);
}