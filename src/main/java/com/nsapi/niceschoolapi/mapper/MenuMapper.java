package com.nsapi.niceschoolapi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nsapi.niceschoolapi.entity.Menu;
import java.util.List;
import java.util.Map;

import com.nsapi.niceschoolapi.entity.ShowMenuVo;

public interface MenuMapper extends BaseMapper<Menu> {

    List<ShowMenuVo> selectShowMenuByUser(Map<String,Object> map);

    List<Menu> getMenus(Map<String,Object> map);
}